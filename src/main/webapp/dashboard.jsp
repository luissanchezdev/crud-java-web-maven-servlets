<%-- 
    Document   : dashboard
    Created on : 3 feb 2024, 22:50:57
    Author     : luissdev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard | ServiDatos</title>
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
            <section class="form-container">
                <h2>Ver todos los usuarios</h2>
                <form action="FormRegisterSvt" method="GET">
                    <button>Ver</button>
                </form>
            </section>
        </main>
    </body>
</html>
