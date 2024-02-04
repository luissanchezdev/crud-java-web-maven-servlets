/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.pqrcompany.servidatos.controller;

import com.pqrcompany.servidatos.dao.ConexionMySQLDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luissdev
 */
@WebServlet(name = "FormLoginServlet", urlPatterns = {"/FormLoginServlet"})
public class FormLoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
            try (Connection conexion = ConexionMySQLDao.obtenerConexion()) {
                String consulta = "SELECT * FROM usuarios WHERE email = ? AND password = ?";
                    try (PreparedStatement statement = conexion.prepareStatement(consulta)) {

                        statement.setString(1, email);
                        statement.setString(2, password);


                        ResultSet filasDevueltas = statement.executeQuery();
                        
                        System.out.println(filasDevueltas);

                        if (filasDevueltas.next()) {
                            System.out.println(filasDevueltas);
                            System.out.println("Se ha registrado exitosamente");
                            response.sendRedirect("dashboard.jsp");
                        } else {
                            System.out.println("Datos erroneos");
                            response.sendRedirect("login.html");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    } 
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
