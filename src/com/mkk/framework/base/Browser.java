package com.mkk.framework.base;

import org.openqa.selenium.WebDriver;

/**
 * Created by mboyaci on 27.12.2017.
 */
public class Browser extends Base{

    private WebDriver _driver;

    public Browser(WebDriver driver) {
        _driver = driver;
    }

    public BrowserType Type;


    public void GoToUrl(String url)
    {
        _driver.get(url);
    }

    public void Maximize()
    {
        _driver.manage().window().maximize();
    }

}


