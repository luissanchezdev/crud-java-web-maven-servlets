/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.pqrcompany.servidatos.controller;

import com.pqrcompany.servidatos.dao.ConexionMySQLDao;
import com.pqrcompany.servidatos.model.UsuarioModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luissdev
 */
@WebServlet(name = "FormRegisterSvt", urlPatterns = {"/FormRegisterSvt"})
public class FormRegisterSvt extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<UsuarioModel> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new UsuarioModel(1,"maria", "320454", "alvarez", "example@example.com", "2023"));
        listaUsuarios.add(new UsuarioModel(1,"sebas", "320454", "alvarez", "example@example.com", "2023"));
        listaUsuarios.add(new UsuarioModel(1,"luis", "320454", "alvarez", "example@example.com", "2023"));
        
        HttpSession actualSesion = request.getSession();
        actualSesion.setAttribute("listaUsuarios", listaUsuarios);
        response.sendRedirect("lista-usuarios.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Esta ingresando al controll");
        String name = request.getParameter("name");
        System.out.println(name);
        String password = request.getParameter("password");
        System.out.println("password");
        
            try (Connection conexion = ConexionMySQLDao.obtenerConexion()) {
                String consulta = "INSERT INTO usuarios (nombre, telefono, direccion) VALUES (?, ?, ?)";
                    try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                        // Paso 4: Establecer los valores de los parámetros
                        statement.setString(1, "cristina estrada");
                        statement.setString(2, "3222592301");
                        statement.setString(3, "alvarez");

                        // Paso 5: Ejecutar la consulta de inserción
                        int filasAfectadas = statement.executeUpdate();

                        if (filasAfectadas > 0) {
                            System.out.println("Inserción exitosa.");
                        } else {
                            System.out.println("No se pudo insertar el registro.");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    } 
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
                
        
        response.sendRedirect("agradecimiento.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
