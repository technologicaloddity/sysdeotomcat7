<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Hello World!</title></head>
<body>
Hello world from Spring controller!
<br/>
Here is the test message:
<br/>EL Syntax: ${testMessage }
<br/>COUT JSTL Syntax: <c:out value="${testMessage }"/>
</body>
</html>