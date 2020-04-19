<%-- 
    Document   : WordCount
    Created on : Feb 4, 2020, 1:44:54 PM
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WordCount</title>
    </head>
    <body>
        <form action="" method="post">
            <table border="0">
                <tr>
                    <td>Enter Text:</td>
                    <td><input type="text" name="words" id="words" value="${param.words}" required></td>
                </tr>
                <tr>
                    <th colspan="2"><input type="submit" name="submit" value="Submit"></th>
                </tr>
            </table>
        </form>
        <c:choose>
            <c:when test="${empty param.words}"></c:when>
            <c:otherwise>
                <c:forTokens var="word" delims=" " items="${fn:toUpperCase(param.words)}" varStatus="counter">${word}<br>
                    <c:if test="${counter.last == true}">Count is:${counter.count}</c:if>
                </c:forTokens>
            </c:otherwise>
        </c:choose>
    </body>
</html>

