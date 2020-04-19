<%-- 
    Document   : newjsp
    Created on : 16 Feb, 2020, 12:41:48 AM
    Author     : modhv
--%>

<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>     
   <form action="FileDownloadServlet" method="post">
            <select name="file_name" >
                <% File file=new File(application.getRealPath("/Static"));
                    String filenames[]=file.list();
                    for(int i=0;i<filenames.length;i++)
                    {
                %>                  
                <option value="<%=filenames[i] %>"><%=filenames[i] %></option>
                <% }  

                %>
            </select>
            <input type="submit">
        </form>
    </body>
</html>
