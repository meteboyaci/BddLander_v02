package com.mkk.framework.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by mboyaci on 27.12.2017.
 */
public class DatabaseUtil {

    public static Connection Open(String connectionString)
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            return DriverManager.getConnection(connectionString);
        }
        catch (Exception e)
        {

        }
        return null;

    }

    public static void Close()
    {
        //
    }

    public static void ExecuteQuery(String query, Connection connection)
    {
        Statement statement = null;
        try
        {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
        }
        catch (Exception e)
        {

        }
    }
}
