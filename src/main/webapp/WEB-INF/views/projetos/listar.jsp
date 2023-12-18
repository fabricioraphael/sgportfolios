<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <link href="../static/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>

<jsp:include page="../header.jsp" />

<div class="container mt-4">
    <div class="row">
        <div class="col-12">
            <table class="table table-striped table-hover">
                <thead class="table-primary">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Nome</th>
                        <th scope="col">Data Início</th>
                        <th scope="col">Previsão Fim</th>
                        <th scope="col">Data Fim</th>
                        <th scope="col">Descrição</th>
                        <th scope="col">Status</th>
                        <th scope="col">Orcamento</th>
                        <th scope="col">Risco</th>
                        <th scope="col">Gerente</th>
                        <th scope="col"></th>
                        <th scope="col"></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${projetos}" var="projeto">
                        <tr>
                            <th class="col-1" scope="row"><c:out value="${projeto.id()}"/></th>
                            <th class="col-2" scope="row"><c:out value="${projeto.nome()}"/></th>
                            <th class="col-1" scope="row"><c:out value="${projeto.dataInicio()}"/></th>
                            <th class="col-1" scope="row"><c:out value="${projeto.dataPrevisaoFim()}"/></th>
                            <th class="col-1" scope="row"><c:out value="${projeto.dataFim()}"/></th>
                            <th class="col-2" scope="row"><c:out value="${projeto.descricao()}"/></th>
                            <th class="col-1" scope="row"><c:out value="${projeto.status()}"/></th>
                            <th class="col-1" scope="row"><c:out value="${projeto.orcamento()}"/></th>
                            <th class="col-1" scope="row"><c:out value="${projeto.risco()}"/></th>
                            <th class="col-1" scope="row"><c:out value="${projeto.gerente().nome}"/></th>
                            <th class="col-1" scope="row"><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></th>
                            <th class="col-1" scope="row"><button type="button" class="btn btn-outline-danger btn-sm">Remover</button></th>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <div class="row">
        <a href="/projetos/criar" class="btn btn-primary" >Novo Projeto</a>

    </div>
</div>

<script type="text/javascript" src="../static/js/bootstrap.min.js"></script>
</body>
</html>
