package org.selenium_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    WebDriver driver;
    @Test
    public void setup()
    {
       // WebDriverManager.Chromedriver();
      // driver = new ChromeDriver();

     //WebDriverManager.firefoxdriver().setup();
        //driver   = new FirefoxDriver();
      //WebDriverManager.firefoxdriver();

        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver();

        driver = new ChromeDriver();

        driver.get("https://www.asda.com");
        driver.manage().timeouts().implicitlyWait(:30,Timesuit);
        driver.manage().window().maximize();
    }


}
