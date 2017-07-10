
package com.kgfsl.csvtobean;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LoadData {
    //static String sql="";
    public static void main(String[] args) throws Exception {
        String filename = ("C://Users//suriyan.s//Documents//suriyan//employees.csv");
        //String filename = file.getAbsolutePath();
        System.out.println(filename);
        String tablename = "employee";
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");

        // Load the data
        String qry = "LOAD DATA LOCAL INFILE '" + filename + "' INTO TABLE " + tablename + " FIELDS TERMINATED BY ','"
                + " LINES TERMINATED BY '\n'(id,name,role,salary)";
        //System.out.println(qry);
        Statement stmt = connection.createStatement();
        stmt.execute(qry);
    }
}