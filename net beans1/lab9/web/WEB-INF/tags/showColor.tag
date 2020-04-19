<%-- 
    Document   : showColor
    Created on : 28 Feb, 2020, 10:51:19 PM
    Author     : modhv
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>

<%-- any content can be specified here e.g.: --%>
<h2>${message}</h2>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@attribute name="colorlist" type="java.util.ArrayList<Color>"%>
<c:forEach items="${colorlist}" var="col">
    Color Name : ${col.name}
    <br>
    Color value : ${col.rgb}
</c:forEach>