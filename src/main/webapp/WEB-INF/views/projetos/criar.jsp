<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <link href="../static/css/bootstrap.min.css" rel="stylesheet"/>

    <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>

    <script>
        $( function() {
            $( "#dataInicio" ).datepicker({ dateFormat: 'dd/mm/yy' });
            $( "#dataPrevisaoFim" ).datepicker({ dateFormat: 'dd/mm/yy' });
            $( "#dataFim" ).datepicker({ dateFormat: 'dd/mm/yy' });
        } );
    </script>
</head>
<body>

<jsp:include page="../header.jsp" />

<div class="container mt-4">
    <div class="row">
        <div class="col-12">
            <form action="salvar" method="post">

            <form:form method="POST"
                      action="/projetos/salvar" modelAttribute="projeto">

                <div class="row">
                    <div class="col">
                        <div class="form-group">
                            <label for="nome">Nome</label>
                            <input type="text" class="form-control" id="nome" name="nome" placeholder="Nome do projeto">
                        </div>
                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="status">Status</label>
                            <select class="form-select" id="status" name="status">
                                <c:forEach items="${projetoStatus}" var="pStatus">
                                    <option value="${pStatus}">${pStatus}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="risco">Risco</label>
                            <select class="form-select" id="risco" name="risco">
                                <c:forEach items="${projetoRisco}" var="pRisco">
                                    <option value="${pRisco}">${pRisco}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col">
                        <div class="form-group">
                            <label for="dataInicio">Data de início</label>
                            <input type="text" class="form-control" id="dataInicio" name="dataInicio" placeholder="Data de início">
                        </div>
                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="dataPrevisaoFim">Data Previsão Fim</label>
                            <input type="text" class="form-control" id="dataPrevisaoFim" name="dataPrevisaoFim" placeholder="Data Previsão Fim">
                        </div>
                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="dataFim">Data Fim</label>
                            <input type="text" class="form-control" id="dataFim" name="dataFim" placeholder="Data Fim">
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col">
                        <div class="form-group">
                            <label for="orcamento">Orçamento</label>
                            <input type="text" class="form-control" id="orcamento" name="orcamento" placeholder="Orçamento para o projeto">
                        </div>
                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="gerente">Gerente</label>
                            <select class="form-select" id="gerente" name="gerente">
                                <c:forEach items="${gerentes}" var="pGerente">
                                    <option value="${pGerente.id}">${pGerente.nome}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col">
                        <div class="form-group">
                            <label for="descricao">Descrição</label>
                            <textarea class="form-control" id="descricao" name="descricao"
                                rows="5" placeholder="Descreva o projeto"> </textarea>
                        </div>
                    </div>
                </div>

                <a href="${pageContext.request.contextPath }/"
                    class="btn btn-warning"> Back </a>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
        </div>
    </div>

    <div class="row">
        <a href="/projetos/listar" class="btn btn-light" role="button" data-bs-toggle="button">Voltar</a>

    </div>
</div>

<script type="text/javascript" src="../static/js/bootstrap.min.js"></script>
</body>
</html>
