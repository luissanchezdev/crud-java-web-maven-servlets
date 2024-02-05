## Proyecto PQRS - Login y Registro - JAVA - Maven - Servlets - MySQL

![Screenshot at Feb 04 17-36-06](https://github.com/luissanchezdev/crud-java-web-maven-servlets/assets/50006980/46227187-d204-438f-9239-fbee3a98eb20)


1. Crear base de datos en mysql y crear las tablas usando el script /src/main/webapp/db/db_servidatos.sql
**Nota**: El nombre de la base de datos es de su elección
2. Actualizar los datos de conexión con la base de datos en /src/main/java/pqrcompany/servidatos/dao/ConexionMySQLDao.java
   - URL : Cambiar el nombre de la base de datos en la url
   - USER: Usuario de la base de datos
   - PASSWORD: Contraseña asignada al usuario de la base de datos
3. En la carpeta principal del proyecto abierto en Netbeans:
   - Dar clic contrario en la carpeta /Dependencies y seleccionar "Add dependency"
   - En la ventana abierta buscar mysql y escoger : mysql-connector-java-version*
4. En la carpeta raiz /servidatos dar clic contrario y seleccionar "clean and build"
5. Seleccionar el botón **Play** (Run Main Project) para ejecutar el proyecto
6. Se ha definido el usuario por defecto:
   **Email**: martha@example.com
   **Contraseña**: 2023

7. Capturas:

![Screenshot at Feb 04 17-36-31](https://github.com/luissanchezdev/crud-java-web-maven-servlets/assets/50006980/021fe411-8e35-45c3-8ab8-8de8997f5648)

![Screenshot at Feb 04 17-37-13](https://github.com/luissanchezdev/crud-java-web-maven-servlets/assets/50006980/9af2e542-2c4a-4f93-9c0a-0aa4ee3091ed)
