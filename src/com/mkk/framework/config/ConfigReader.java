package com.mkk.framework.config;

import com.mkk.framework.base.BrowserType;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by mboyaci on 29.12.2017.
 */
public class ConfigReader {

    public static void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }

    private void ReadProperty() throws IOException {
        //Create PropertyObject
        Properties properties = new Properties();
        //Load the Property file available in same package
        properties.load(getClass().getResourceAsStream("GlobalConfig.properties"));
        //Get AUTConnection String
        Settings.AUTConnectionString = properties.getProperty("AUTConnectionString");
        //Get Reporting String
        Settings.ReportingConnectionString = properties.getProperty("ReportingConnectionString");
        //Get LogPath
        Settings.LogPath = properties.getProperty("LogPath");
        //Get DriverType
        Settings.DriverType = properties.getProperty("DriverType");
        //Get ExcelSheetPath
        Settings.ExcelSheetPath = properties.getProperty("ExcelSheetPath");
        //Get AUT
        Settings.AUT = properties.getProperty("AUT");
        //BrowserType
        Settings.BrowserType = BrowserType.valueOf(properties.getProperty("BrowserType"));


    }
}
