<%-- 
    Document   : newjsp
    Created on : 29 Jan, 2020, 12:18:11 AM
    Author     : modhv
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj1" class="com.calc">
            <jsp:setProperty name="obj1" property="*" />      
        </jsp:useBean>
        <h1> <jsp:getProperty name="obj1" property="result" /></h1>       
    </body>
</html>
