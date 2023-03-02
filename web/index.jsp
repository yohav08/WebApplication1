<%-- 
    Document   : index
    Created on : 15/02/2023, 1:30:17 p. m.
    Author     : ESTUDIANTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    </head>
    <body>
        <h1 class="bg-primary text-white text-center py-3">Hola Mundo JSP!</h1>
        <div class="d-flex justify-content-center py-5">
            <form action="MiServlet" method="post">
                <label>Digite usuario: </label>
                <input class="text-start"type="text" name="txt_nombre" placeholder="Escriba el nombre" required> <br><br>
                
                <label>Digite contraseña: </label>
                <input class="text-start"placeholder="Escriba su contraseña" type="password" name="txt_clave" required>  <br><br>
                
                <div class="d-flex justify-content-around">
                <input class="btn btn-success"type="submit" name="btn_aceptar" value="Registrar">
                <input class="btn btn-danger"type="reset" name="btn_limpiar" value="Limpiar">
                </div>
            </form>
        </div>
    </body>
</html>
