package com.aptech;

public class DatabaseTest {
    public static void main(String[] args) {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sonoo","root","root");
    }
}
