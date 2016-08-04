<%-- 
    Document   : index
    Created on : 04.08.2016, 16:49:20
    Author     : Руслан
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="username" action="pages/main.jsp" method="POST">
            <input type="text" name="username" value="" size="30" />
            <input type="password" name="password" value="" size="30" />
            <input type="submit" value="Ввод" name="login" />
        </form>
    </body>
</html>
