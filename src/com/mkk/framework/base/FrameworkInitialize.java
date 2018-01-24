package com.mkk.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by mboyaci on 27.12.2017.
 */
public class FrameworkInitialize extends Base {

    public void InitializeBrowser(BrowserType browserType) throws MalformedURLException {

        WebDriver driver = null;
        switch (browserType)
        {
            case Chrome:
            {



                System.setProperty("webdriver.chrome.driver", "src/com/mkk/framework/drivers/chromedriver.exe");
                driver = new ChromeDriver(getChromeOptions());
                //tldriver = ThreadLocal.withInitial(() -> new ChromeDriver(chromeOptions()));
                //tldriver.set(driver);
                //WebDriverWait wait = new WebDriverWait(driver, 15);

                break;
            }
            case Firefox:
            {
                System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            }
            case IE:
            {
                break;
            }
            case Safari:
            {
                break;
            }
            case Remote:
            {
                DesiredCapabilities cap = DesiredCapabilities.chrome();
                cap.setBrowserName("chrome");
                cap.setVersion("56.0.2924.87");
                String Node = "http://orkide1.mkk.com.tr:9901/wd/hub";
                driver = new RemoteWebDriver(new URL(Node), cap);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
            case Headless:
            {
                final ChromeOptions chromeOptions = new ChromeOptions();
                //chromeOptions.setBinary("/usr/bin/chromium-browser");
                chromeOptions.addArguments("test-type");
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("window-size=1200x600");
                chromeOptions.addArguments("no-sandbox");
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                System.setProperty("webdriver.chrome.driver", "src/com/mkk/framework/drivers/chromedriver.exe");
                driver = new ChromeDriver(capabilities);


                //driver = new RemoteWebDriver(capabilities);

                break;
            }
        }
        //Set the driver
        DriverContext.setDriver(driver);
        //Browser
        DriverContext.Browser = new Browser(driver);
    }

    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("no-sandbox");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        return options;
    }

}
