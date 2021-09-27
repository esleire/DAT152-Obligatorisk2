<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome page</title>
</head>

<body>
	<p><jsp:include page="chooseLanguage.jsp" /></p>

	<fmt:bundle basename="resources.Messages">
 
		<h2>
			<fmt:message key="greeting" />
		</h2>
		<p>
			<a href="Products"><fmt:message key="products" /> </a> 
	
			<a href="/Cart"><fmt:message key="cart" /> </a>
		</p>

	</fmt:bundle>

</body>
</html>