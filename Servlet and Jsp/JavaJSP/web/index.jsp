<%-- 
    Document   : index
    Created on : May 7, 2023, 12:59:20 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Hello World!</h1>
        <!-- Expression -->
        <%= (2 + 2)%> 
        <!-- variable -->
        <%! int a = 5;%> 
        <!-- variable -->
        <% if (a > 6) {%>
        <input type="text">
        <% } else {%>
        <input type="button" value="hei">
        <% }%>
        

    </body>
</html>
