/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.sql.Connection;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * Database Connection Class
 */
public class JavaConnectDb {
    private static Connection connect = null;

    public static Connection getConnection() {
        try {
            if (connect != null && !connect.isClosed()) {
                connect.close();
            }
            InitialContext ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("jdbc/oracle11g");
            connect = ds.getConnection();
        } catch (Exception e) {
            System.out.println("Failed to Connect : " + e.getMessage());
            return null;
        }
        return connect;
    }
}
