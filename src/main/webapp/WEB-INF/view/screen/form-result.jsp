<%--
  Created by IntelliJ IDEA.
  User: Cazueiro br
  Date: 01/04/2023
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="refresh" content="5;URL=/mural-home">
    <title>Postit armazenado</title>
</head>
<body>
O tema é ${postit.getTema()} <br>
O ID é ${postit.getColaborador()}<br>
O texto é ${postit.getTexto()}
</body>
</html>
