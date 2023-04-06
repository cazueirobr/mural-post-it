<%--
  Created by IntelliJ IDEA.
  User: Cazueiro br
  Date: 01/04/2023
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="stylesheet" href="assets/css/bootstrap.min.css"></link>

    <title>Adicionar Post-it</title>
</head>
<body>
<div class="container-fluid mb-5">
    <nav class="nav nav-pills flex-column flex-sm-row">
        <a class="flex-sm-fill text-sm-center nav-link" href="#">Mural <i class="fa-solid fa-chalkboard"></i></a>
        <a class="flex-sm-fill text-sm-center nav-link active" href="#">Adicionar Post <i class="fa-regular fa-square-plus"></i></a>
        <a class="flex-sm-fill text-sm-center nav-link" href="#">Colaborador <i class="fa-regular fa-user"></i></a>
        <a class="flex-sm-fill text-sm-center nav-link" href="#">Info <i class="fa-solid fa-info"></i></a>
    </nav>

</div>


<div class="container">
    <form action="adicionar-post" method="post">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="form-group">
                <label for="cor">Cor:</label>
                <select class="form-control" id="cor" name="cor">
                    <option value="bg-primary">Azul</option>
                    <option value="bg-warning">Amarelo</option>
                    <option value="bg-success">Verde</option>
                    <option value="bg-light">Branco</option>
                </select>
            </div>
        </div>
        <div class="col-md-6">
            <div class="form-group">
                <label for="colaborador">Colaborador:</label>
                <select class="form-control" id="colaborador" name="colaborador">
                    <option value="1">Matheus</option>
                    <option value="2">Guilherme</option>
                    <option value="3">Henrique</option>
                </select>
            </div>
        </div>
    </div>
    <div class="form-group mb-5">
        <label for="mensagem">Mensagem:</label>
        <textarea class="form-control" id="mensagem" name="mensagem" rows="6"></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Adicionar</button>
    </form>
</div>








<script src="https://kit.fontawesome.com/3d6d8da1fe.js" crossorigin="anonymous"></script>
</body>
</html>
