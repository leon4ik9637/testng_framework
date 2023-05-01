package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){

    }

    public static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver == null){
            //System.setProperty("webdriver.chrome.driver", "/Users/leon.kuchman/IdeaProjects/selenium_intro/chromedriver");

            String browser = "chrome"; // define which browser you will runyour test in

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                default:
                    throw new NotFoundException("Browser IS NOT DEFINED properly!!!");
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver(){
        driver.quit();
        driver = null;
    }

}
