<%--
  Created by IntelliJ IDEA.
  User: jbcode
  Date: 07/03/2021
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="index.do">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="add.do">Add</a>
            </li>
            <li class="nav-item">
                <form action="search.do" method="get">
                    <input type="text" name="word" value="" hidden/>
                    <button type="submit" class="btn btn-primary">All</button>
                </form>
            </li>
        </ul>
    </div>
</nav>