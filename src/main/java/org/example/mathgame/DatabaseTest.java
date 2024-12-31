//package org.example.mathgame;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class DatabaseTest {
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/math_game";
//        String username = "root";
//        String password = "Mikejeb@71";
//
//        try (Connection conn = DriverManager.getConnection(url, username, password)) {
//            if (conn != null) {
//                System.out.println("Database connected successfully!");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
