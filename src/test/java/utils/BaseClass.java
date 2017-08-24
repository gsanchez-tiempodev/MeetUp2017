package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by gilsa on 17/08/2017.
 */
public class BaseClass {

    //WebDriver driver;
    RemoteWebDriver driver;
    public WebDriver getDriver() throws MalformedURLException{
        if (driver == null) {
//            System.setProperty("webdriver.chrome.driver", "C:\\Libs\\chromedriver.exe");
//            driver = new ChromeDriver();
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setCapability("version","");
            cap.setCapability("platform","LINUX");
            driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"),cap);
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
