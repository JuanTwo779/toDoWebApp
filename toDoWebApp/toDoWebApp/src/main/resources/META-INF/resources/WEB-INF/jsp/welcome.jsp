<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
    <body>
        <div class="container">
            <h1>Welcome to the home page ${name}</h1>
            <hr>
            <div>Your Name is: ${name}</div>
            <div>Your password is: ${password}</div>
            <a href="list-todos">Manage</a> your todos
        </div>
    </body>
</html>