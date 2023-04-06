<%--
  Created by IntelliJ IDEA.
  User: Cazueiro br
  Date: 06/04/2023
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@tag description="Template principal" pageEncoding="UTF-8"%>
<%@attribute name="title"%>
<%@attribute name="mural"%>
<%@attribute name="adicionar"%>
<html>
<head>
    <title>${title}</title>
    <link rel="stylesheet" href="assets/css/bootstrap.min.css"></link>
</head>
<body>
<header>
    <div class="container-fluid mb-5">
        <nav class="nav nav-pills flex-column flex-sm-row">
            <a class="flex-sm-fill text-sm-center nav-link ${mural}" href="/">Mural <i class="fa-solid fa-chalkboard"></i></a>
            <a class="flex-sm-fill text-sm-center nav-link ${adicionar}" href="adicionar-post">Adicionar Post <i class="fa-regular fa-square-plus"></i></a>
            <a class="flex-sm-fill text-sm-center nav-link" href="#">Colaborador <i class="fa-regular fa-user"></i></a>
            <a class="flex-sm-fill text-sm-center nav-link" href="#">Info <i class="fa-solid fa-info"></i></a>
        </nav>

    </div>

</header>

<jsp:doBody></jsp:doBody>

<footer>
    Isso é o rodapé
</footer>
<script src="https://kit.fontawesome.com/3d6d8da1fe.js" crossorigin="anonymous"></script>
</body>
</html>
