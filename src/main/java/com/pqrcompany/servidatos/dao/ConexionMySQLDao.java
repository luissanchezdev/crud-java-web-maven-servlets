/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pqrcompany.servidatos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luissdev
 */
public class ConexionMySQLDao {
   private static final String URL = "jdbc:mysql://localhost:3306/db_servidatos";
    private static final String USER = "root";
    private static final String PASSWORD = "310410913";

    public static Connection obtenerConexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException ex) {
            throw new SQLException("Error al cargar el controlador JDBC", ex);
        }
    } 
}
