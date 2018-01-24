package com.mkk.test.steps;


import com.mkk.framework.base.BasePage;
import com.mkk.framework.base.DriverContext;
import com.mkk.framework.base.FrameworkInitialize;
import com.mkk.framework.config.ConfigReader;
import com.mkk.framework.config.Settings;
import com.mkk.framework.utilities.ExcelUtil;
import com.mkk.framework.utilities.LogUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by mboyaci on 02.01.2018.
 */
public class TestInitialize extends FrameworkInitialize {
    @Before
    public void Initialize () throws IOException
    {
        //Initialize config
        ConfigReader.PopulateSettings();

        //Logging
        /*Settings.Logs = new LogUtil();
        Settings.Logs.CreateLogFile();
        Settings.Logs.Write("Framework Initialize");*/

        //Open the browser
        InitializeBrowser(Settings.BrowserType);
        //Settings.Logs.Write(Settings.BrowserType + " Browser Initialized");
        DriverContext.Browser.GoToUrl(Settings.AUT);
        //Settings.Logs.Write("Navigated to URL : " + Settings.AUT);
        DriverContext.Browser.Maximize();

        try {
            ExcelUtil util = new ExcelUtil(Settings.ExcelSheetPath);
        }
        catch (Exception e)
        {

        }
    }


    @After
    public void TearDownTest(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            //Take Screenshot
            System.out.println(scenario.getName());

        }
        DriverContext.Driver.quit();
    }
}
