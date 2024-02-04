<%-- 
    Document   : lista-usuarios
    Created on : 3 feb 2024, 20:53:48
    Author     : luissdev
--%>

<%@page import="java.util.List"%>
<%@page import="com.pqrcompany.servidatos.model.UsuarioModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Usuarios | ServiDatos</title>
        <link rel="stylesheet" href="https://unpkg.com/boltcss/bolt.min.css">
        <link type="text/css" rel="stylesheet" href="./css/styles.css">
    </head>
    <body>
        <header>
            <h1>Servi<span>Datos</span></h1>
            <nav>
                <ul>
                    <li><a href="index.html">Inicio</a></li>
                    <li><a href="login.html">Iniciar Sesión</a></li>
                    <li><a href="register.html">Registro</a></li>
                </ul>
            </nav>
        </header>
        <main>
            <h2>Lista de usuarios</h2>
            <section class="lista-usuarios">
                <% 
                    List<UsuarioModel> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
                    int count = 1;

                    for(UsuarioModel user : listaUsuarios){
                %>
                <div class="card">
                    <p><span>ID:</span> <%= user.getId() %></p>
                    <p><span>Nombre:</span> <%= user.getName() %> </p>
                    <p><span>Teléfono:</span> <%= user.getPhone()  %></p>
                    <p><span>Dirección:</span> <%= user.getAdress()  %></p>
                    <p><span>Correo electrónico:</span>: <%= user.getEmail()  %></p>
                </div>
                <% count = count +1;  %>
                <%  }%>
                
            </section>
        </main>
    </body>
</html>
