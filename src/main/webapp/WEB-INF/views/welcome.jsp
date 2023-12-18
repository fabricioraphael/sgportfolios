<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="static/css/bootstrap.min.css" rel="stylesheet"/>

</head>
<body>
<jsp:include page="header.jsp" />

<div class="container">
    <div class="starter-template">
        <h1>Spring Boot Example</h1>
        <div>
            <strong>Current time:</strong> ${time}
            <br>
            <strong>Message from application properties:</strong> ${message}
        </div>
    </div>
</div>


<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
</body>
</html>
