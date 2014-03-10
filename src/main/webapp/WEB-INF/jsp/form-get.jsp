<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
<head><title>Edit Form</title></head>
<body>
<spring-form:form modelAttribute="formModel" method="POST">
<table cellpadding="20">
	<tr>
		<td>Key</td>
		<td><spring-form:input path="key"/></td>
	</tr>
	<tr>
		<td>Value</td>
		<td><spring-form:input path="value"/></td>
	</tr>
	<tr>
		<td></td>
		<td><spring-form:errors path="*" /></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit"></td>
</table>
</spring-form:form>

</body>
</html>