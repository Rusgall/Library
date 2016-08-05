<%-- 
    Document   : main
    Created on : 04.08.2016, 16:50:18
    Author     : Руслан
--%>

<%@page import="Test.TestConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8");%>
        <%=request.getParameter("username") %>
        <h3>
            ${param["password"]}
        </h3>
            <% TestConnection ts = new TestConnection();%>
            <%= ts.check()%>
    </body>
</html>
