package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest

{

    @Test
    public void testApp() throws MalformedURLException, InterruptedException {
//        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();


//        options.setBrowserVersion("116");

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");

//        WebDriver driver = new ChromeDriver(desiredCapabilities);
        WebDriver driver = new RemoteWebDriver(new URL("http://54.252.61.87:4444"), desiredCapabilities);

        driver.get("https://urdu.arynews.tv/");
//        Thread.sleep(5000);s
        String tittle = driver.getTitle();
        if (!tittle.equalsIgnoreCase("")) {
            System.out.println("Website has been opened: "+tittle);
        }
        Assert.assertEquals("5","5");

        driver.quit();
    }
}


