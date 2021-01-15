/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.Utils;

import java.sql.Connection;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author erginushi
 */

public class DataSource {
    public static BasicDataSource basicDataSource;
    //private static int poolMaxConnections = 50;
    private static final int poolMinConnections = 5;

    private DataSource() {
    }

    public static synchronized Connection getConnection() throws Exception {
        if (basicDataSource == null) {
            basicDataSource = new BasicDataSource();
            String IP = "51.144.100.12";
            String port = "1433";
            String database = "EcommerceDb";
            String username = "admin";
            String password = "1234Ergi1234";
            int maxConnections = 100;
            basicDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url ="jdbc:sqlserver://"+IP+":"+port+";databaseName="+ database;
            basicDataSource.setUrl(url);
            basicDataSource.setUsername(username);
            basicDataSource.setPassword(password);
            basicDataSource.setInitialSize(poolMinConnections);
            basicDataSource.setMaxActive(maxConnections);
            basicDataSource.setMaxWait(100);
            basicDataSource.setTestOnBorrow(true); //default true
            basicDataSource.setTestOnReturn(true);
            basicDataSource.setTestWhileIdle(true);
            basicDataSource.setValidationQuery("Select 1");
            basicDataSource.setMaxIdle(poolMinConnections);
            basicDataSource.setPoolPreparedStatements(false);
        }
        Connection connection = basicDataSource.getConnection();
        connection.setAutoCommit(false);
        return connection;
    }

}