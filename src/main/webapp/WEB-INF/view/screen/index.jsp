<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:template title="Home" mural="active">
<jsp:body>
    <link rel="stylesheet" href="assets/css/postit.css"></link>
    <div class="container mt-4">
<c:if test="${not empty postits}">
<c:forEach var="postit" items="${postits}" varStatus="status">
    <c:if test="${status.index % 3 == 0}">
        <div class="row">
    </c:if>

    <div class="col m-3">
        <div class="card ${postit.getTema()} text-white">
            <div class="card-body">
                <blockquote class="blockquote mb-0">
                    <p>${postit.getTexto()}</p>
                    <footer class="blockquote-footer">Feito por: <cite class="text-white" title="Título da fonte">${postit.getColaborador().getNome()}</cite></footer>
                </blockquote>
            </div>
        </div>


    </div>
    <c:if test="${status.index % 3 == 2}">
    </div>
    </c:if>
</c:forEach>
</c:if>





    </div>
</jsp:body>
</t:template>