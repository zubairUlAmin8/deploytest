package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest

{

    @Test
    public void testApp()
    {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--window-size=1920,1200","--ignore-certificate-errors");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://urdu.arynews.tv/");
        String tittle = driver.getTitle();
        if (!tittle.equalsIgnoreCase("")) {
            System.out.println("Website has been opened: "+tittle);
        }
        driver.close();
    }
}
