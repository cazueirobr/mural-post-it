<%--
  Created by IntelliJ IDEA.
  User: Cazueiro br
  Date: 07/04/2023
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Informações" info="active">
    <jsp:body>
        O numero de visitantes é ${visitantes} <br>
        O numero da sua visita é ${numeroVisita}
    </jsp:body>
</t:template>