package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

    /**
     * HighLight an element
     *
     * @param element
     * @throws Exception
     *
     * @throws InterruptedException
     */
    public void highlight(WebElement element) throws Exception{
        //Creating JavaScriptExecuter Interface
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        for (int iCnt = 0; iCnt < 3; iCnt++) {
            //Execute javascript
            try {
                js.executeScript("arguments[0].setAttribute('style','background: yellow')", element);
                Thread.sleep(100);
                js.executeScript("arguments[0].setAttribute('style','background:')", element);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                throw new Exception("Class SeleniumUtils | Method fnHighlightMe | Exception desc: Exception");
            }
        }
    }
}
