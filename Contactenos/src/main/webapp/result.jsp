<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Resultados del formulario</title>
    <link rel="stylesheet" href="css/estiloJSP.css">
</head>
<body>
<h1> Datos del formulario</h1>
<div>${requestScope.Contacto.nombre}</div>
<div>${requestScope.Contacto.correo}</div>
<div>${requestScope.Contacto.asunto}</div>
<div>${requestScope.Contacto.mensaje}</div>
</body>
</html>