<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping cart</title>
</head>
<body>

	<p><jsp:include page="chooseLanguage.jsp" /></p>

	<fmt:bundle basename="resources.Messages">

		<h1>
			<fmt:message key="cart" />
		</h1>
		
		<c:forEach var="product" items="${cart}" varStatus="loop">
		<div>
		<p><fmt:message key="title" />: ${ product.pName }</p>
		<p><fmt:message key="price" />: ${ product.priceInEuro } </p>
		<p> Count: ${ product.count } </p>
		</div>
		</c:forEach>
		
		<p>Total price: ${ totalPrice } </p>
		
		<a href="Products"><fmt:message key="products" /> </a>

	</fmt:bundle>


</body>
</html>