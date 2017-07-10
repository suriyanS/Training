package com.kgfsl.csvtobean;

import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.opencsv.bean.CsvToBean;

import java.sql.*;

class OpenCSVParse2BeanHeader2DB {
    static Connection conn = null;
    static String sql = "";
    static boolean isSuccess = false;
    static PreparedStatement preparedStatement = null;

    public static void main(String[] args) throws IOException {
        //Connection conn = DBConnection.getDBConnection();

        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\suriyan.s\\Documents\\suriyan\\employees.csv"),
                ',');

        HeaderColumnNameMappingStrategy<Employee> beanStrategy = new HeaderColumnNameMappingStrategy<Employee>();
        beanStrategy.setType(Employee.class);

        CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
        List<Employee> emps = csvToBean.parse(beanStrategy, reader);

        System.out.println(emps);

        //DB

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

      
        if (conn != null) {
            try {
                for (Employee e : emps) {

                    sql = "INSERT INTO `employee` (`id`,`name`, `role`, `salary`) VALUES (\"" + e.getId() + "\", \""
                            + e.getName() + "\", \"" + e.getRole() + "\", \"" + e.getSalary() + "\");";

                    preparedStatement = conn.prepareStatement(sql);
                    preparedStatement.executeUpdate(sql);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        reader.close();

        //return emps;

    }
}