<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:template title="Adicionar" adicionar="active">
    <jsp:body>
        <div class="container">
            <form action="adicionar-post" method="post">
                <div class="row justify-content-center">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="cor">Cor:</label>
                            <select class="form-control" id="cor" name="cor">
                                <option value="azul-escuro">Azul escuro</option>
                                <option value="azul-claro">Azul claro</option>
                                <option value="vermelho">Vermelho</option>
                                <option value="laranja">Laranja</option>
                                <option value="amarelo">Amarelo</option>
                                <option value="verde">Verde</option>
                                <option value="roxo">Roxo</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="colaborador">Colaborador:</label>
                            <select class="form-control" id="colaborador" name="colaboradores">
                                <c:forEach var="colaborador" items="${colaboradores}">
                                    <option value="${colaborador.getId()}">${colaborador.getNome()}</option>
                                </c:forEach>
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

    </jsp:body>
</t:template>