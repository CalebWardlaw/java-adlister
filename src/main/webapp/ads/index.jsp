<%--
  Created by IntelliJ IDEA.
  User: calebwardlaw
  Date: 1/22/21
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>

<%--Create a file ads/index.jsp. This file will show a listing of all the ads on your site.
This page should be available when a user visits /ads.
Use the all method on the ListAdsDao class to get a listing of all the ads, and pass this on to your JSP file.
In your JSP file, loop through all the ads and display each one.--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Products</title>
</head>
<body>
<h1>Displaying Products</h1>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <p>${ad.id}</p>
        <h2>${ad.title}</h2>
        <p>${ad.userId}</p>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>


</body>
</html>
