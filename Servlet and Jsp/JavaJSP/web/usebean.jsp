<%-- 
    Document   : usebean
    Created on : May 7, 2023, 1:19:13 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--Object Creation   -->
<jsp:useBean id="useBean" class="usebean.MessageBean" scope="request"></jsp:useBean>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bean Example</title>
    </head>
    <body>
        <h1>Intial Calling using JSP Action get Property</h1>
    <jsp:getProperty name="useBean" property="message"></jsp:getProperty>
    </body>
</html>
