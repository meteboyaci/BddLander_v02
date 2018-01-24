package com.mkk.framework.config;

import com.mkk.framework.base.BrowserType;
import com.mkk.framework.utilities.LogUtil;

import java.sql.Connection;

/**
 * Created by mboyaci on 27.12.2017.
 */
public class Settings {


    //For Application Backend
    public static Connection AUTConnection;
    //For EARS Reporting
    public static Connection ReportingConnection;
    //For Application backend connection string
    public static String AUTConnectionString;
    public static String ReportingConnectionString;
    //Log path for framework
    public static String LogPath;
    //Driver Type for SQL Server connectivity
    public static String DriverType;
    public static String ExcelSheetPath;
    public static String AUT;
    public static BrowserType BrowserType;
    public static LogUtil Logs;



}
