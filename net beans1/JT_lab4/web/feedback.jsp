<%-- 
    Document   : feedback5
    Created on : 22 Feb, 2020, 11:24:53 AM
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
        Name :<%=request.getParameter("name") %><br>
        E-mail :<%=request.getParameter("email") %><br>
        Subject :<%=request.getParameter("subject") %><br>
        Message :<%=request.getParameter("ta") %><br>
        <% out.println("feedback is recived"); %>
        
    </body>
</html>
