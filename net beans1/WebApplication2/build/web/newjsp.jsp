<%-- 
    Document   : newjsp
    Created on : 13 Feb, 2020, 2:23:02 AM
    Author     : modhv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= request.getAttribute("person") %>
        <h1>Hello World!</h1>
    </body>
</html>
