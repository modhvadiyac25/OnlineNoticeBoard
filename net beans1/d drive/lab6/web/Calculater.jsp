 <%@page contentType="text/html" pageEncoding="UTF-8"%>

 <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        <jsp:useBean id="obj1" class="Calculater" >
            
        </jsp:useBean>
        <jsp:setProperty name="obj1" property="*" />
        <jsp:getProperty name="obj1" property="result"   />
    </body>
</html>
