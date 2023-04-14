<%--
  Created by IntelliJ IDEA.
  User: Cazueiro br
  Date: 14/04/2023
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Colaborador" colaborador="active">
  <jsp:body>
    <div class="container">
    <h2>Adicionar Colaborador</h2>
    <form action="adicionar-colaborador" method="post">
      <div class="form-group">
        <div class="row">
          <label for="nome" class="col-sm-2 control-label">Nome:</label>
          <div class="col-sm-4">
            <input type="text" class="form-control" id="nome" name="nome" placeholder="Digite seu nome">
          </div>
          <div class="col-sm-4">
            <input type="text" class="form-control" id="sobrenome" name="sobrenome" placeholder="Digite seu sobrenome">
          </div>
          <div class="col-sm-2">
            <button type="submit" class="btn btn-primary">Enviar</button>
          </div>
        </div>
      </div>
    </form>
  </jsp:body>
</t:template>