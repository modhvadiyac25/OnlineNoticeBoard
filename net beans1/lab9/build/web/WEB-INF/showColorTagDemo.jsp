<%-- 
    Document   : showColorTagDemo
    Created on : 28 Feb, 2020, 10:12:19 PM
    Author     : modhv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="clr" uri="/WEB-INF/tags" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <clr:showColor colorlist="${requestScop.myValue}"/>
    </body>
</html>
