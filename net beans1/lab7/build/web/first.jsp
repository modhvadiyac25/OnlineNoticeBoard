<%-- 
    Document   : session
    Created on : 22 Feb, 2020, 5:41:16 PM
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
        <h1>Hello World!</h1>
        <%! String username=null; %>
        <%
            
            username= session.getAttribute('chetan');
        %>
        <%= username %>
    </body>
</html>
