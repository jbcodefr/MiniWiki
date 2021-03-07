<%--
  Created by IntelliJ IDEA.
  User: jbcode
  Date: 07/03/2021
  Time: 23:05
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
            Add article
        </div>
        <div class="card-body">
            <form action="save.do" method="post">
                <div class="form-group">
                    <label class="control-label">Title :</label>
                    <input type="text" name="title" class="form-control" />
                </div>
                <div class="form-group">
                    <label class="control-label">Content :</label>
                    <textarea name="content" type="text" class="form-control" rows="4"></textarea>
                </div>
                <div>
                    <button type="submit" class="btn btn-primary">Add</button>
                </div>
            </form>
        </div>
    </div>
</div>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<%@include file="footer.jsp" %>
</body>
</html>