<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
<head><title>Form Result</title></head>
<body>
You entered value ${formModel.value } for key ${formModel.key }!
<br/>
<a href="<c:url value='/form'/>">Do it again</a>
</body>
</html>