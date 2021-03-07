<%--
  Created by IntelliJ IDEA.
  User: jbcode
  Date: 07/03/2021
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
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
<p>@jbcode 2021</p>