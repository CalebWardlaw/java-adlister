<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: calebwardlaw
  Date: 1/20/21
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--Also just to clarify, these exercises can be completed without creating a Servlet and just using the JSP and JSTL syntax. Combining Servlets with JSPs will be in the next lesson.--%>


<%--An additional hint. Remember that this tag (<% %>) can evaluate any arbitrary Java code.--%>



<html>
<head>
    <title>${title}</title>
</head>
<body>
<h1>Happy path found</h1>
<%@ include file="partials/navbar.jsp" %>
<%@ include file="partials/footer.jsp" %>
</body>
</html>
