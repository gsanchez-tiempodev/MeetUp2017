package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

/**
 * Created by gilsa on 17/08/2017.
 */
public class BaseClass {

    WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Libs\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    @AfterTest
    public void tearDown(){
        getDriver().quit();
    }
}
