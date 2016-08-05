<%@page import="Data.Author"%>
<%@page import="Data.AuthorList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Онлайн библиотека</title>
        <link href="../css/style_main.css" rel="stylesheet" type="text/css">
    </head>
    <body>

        <div class="container">


            <div class="header">
                <img alt="Логотип" name="logo" width="100%" height="90"/>

                <form class="search_form" name="search_form" method="POST">
                    <img src="../images/search.jpg"/> 
                    <input type="text" name="search_String" value="" size="100" />
                    <input type="submit" value="Поиск" name="search_button" />
                    <select name="search_option">
                        <option>Название</option>
                        <option>Автор</option>
                    </select>
                </form>
            </div>




            <div class="sidebar1">
                <h4>Авторы:</h4>
                <ul class="nav">
                    <% AuthorList authorList = new AuthorList();
                        for (Author author : authorList.getAuthorList()) {
                    %>
                    <li><a href="#"><%=author.getName()%></a></li>

                    <%}%>
                </ul>
                <p>???</p>
            </div>




            <div class="content">
                <h1>Контент1</h1>
                <p>Контент2;</p>
            </div>



        </div><!-- end .container -->

    </body>
</body>

</body>
</html>
