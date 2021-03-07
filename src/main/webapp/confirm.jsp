<%--
  Created by IntelliJ IDEA.
  User: jbcode
  Date: 07/03/2021
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>MiniWiki</title>
    <%@include file="header.jsp" %>
</head>
<body>

<div class="container">
    <div class="card">
        <div class="card-header">
            Aded : ${article.title} to DB
        </div>
    </div>
</div>

<%--<a href="hello-servlet">Hello Servlet</a>--%>
<%@include file="footer.jsp" %>
</body>
</html>