<%-- 
    Document   : logout
    Created on : 14 Mar, 2020, 10:12:07 PM
    Author     : modhv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    session.invalidate();
    response.sendRedirect("http://localhost:8080/OnlineNoticeBoard/template/student/login.jsp");
%>