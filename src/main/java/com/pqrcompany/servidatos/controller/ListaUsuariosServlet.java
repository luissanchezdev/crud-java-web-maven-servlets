/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.pqrcompany.servidatos.controller;

import com.pqrcompany.servidatos.dao.ConexionMySQLDao;
import com.pqrcompany.servidatos.model.UsuarioModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luissdev
 */
@WebServlet(name = "ListaUsuariosServlet", urlPatterns = {"/ListaUsuariosServlet"})
public class ListaUsuariosServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (Connection conexion = ConexionMySQLDao.obtenerConexion()) {
                String consulta = "SELECT * FROM usuarios;";
                    try (Statement statement = conexion.createStatement()) {

                        ResultSet filasDevueltas = statement.executeQuery(consulta);
                        System.out.println("Filas Devueltas");
                        System.out.println(filasDevueltas);
                        

                            System.out.println("inside if");
                            List<UsuarioModel> listaUsuarios = new ArrayList<>();
                            while(filasDevueltas.next()){
                                int id = filasDevueltas.getInt("id");
                                String name = filasDevueltas.getString("name");
                                String phone = filasDevueltas.getString("phone");
                                String address = filasDevueltas.getString("address");
                                String email = filasDevueltas.getString("email");
                                String password = filasDevueltas.getString("password");
                                System.out.println("Inside while");
                                System.out.println(name + " " + phone + " "+ address + " " + email + " " + password);
                                listaUsuarios.add(new UsuarioModel(id, name, phone, address, email, password));
                            }

                            HttpSession actualSesion = request.getSession();
                            actualSesion.setAttribute("listaUsuarios", listaUsuarios);

                            System.out.println(filasDevueltas);
                            System.out.println(listaUsuarios);
                            System.out.println("Se ha registrado exitosamente");
                            response.sendRedirect("lista-usuarios.jsp");
                         
//                        else {
//                            System.out.println("Datos erroneos");
//                            response.sendRedirect("login.html");
//                        }
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
        processRequest(request, response);
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
