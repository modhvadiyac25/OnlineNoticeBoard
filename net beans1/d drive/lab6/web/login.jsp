<%-- 
    Document   : login
    Created on : 3 Mar, 2020, 5:58:30 PM
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
        <jsp:useBean id="obj1" class="login">
            
            <jsp:setProperty name="obj1" property="*"></jsp:setProperty>
        </jsp:useBean>
            <jsp:getProperty name="obj1" property="getSem"></jsp:getProperty>
    </body>
</html>
