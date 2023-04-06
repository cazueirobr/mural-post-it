<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:template title="Home" adicionar="active">
    <jsp:body>
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

    </jsp:body>
</t:template>