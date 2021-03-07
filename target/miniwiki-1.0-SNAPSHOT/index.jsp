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
            Search article
        </div>
        <div class="cart-body">
            <form action="search.do" method="get">
                <label>Search</label>
                <input type="text" name="word" value="${model.word}" placeholder="Enter word"/>
                <button type="submit" class="btn btn-primary">Search</button>
            </form>
            <table class="table table-striped">
                <tr>
                    <th>ID</th>
                    <th>Title</th>
                    <th>Content</th>
                </tr>
                <c:forEach items="${model.articleList}" var="a">
                    <tr>
                        <td>${a.id}</td>
                        <td>${a.title}</td>
                        <td><h6>${a.content}</h6></td>
                        <td><a onclick="return confirm('confirm ?')"
                               href="delete.do?id=${a.id}">Delete</a></td>
                        <td><a href="edit.do?id=${a.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<%@include file="footer.jsp" %>
</body>
</html>