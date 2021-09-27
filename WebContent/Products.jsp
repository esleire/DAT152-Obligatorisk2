<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Products</title>
</head>

<body>

	<p><jsp:include page="chooseLanguage.jsp" /></p>

	<fmt:bundle basename="resources.Messages">

		<h1>
			<fmt:message key="products" />
		</h1>
		
		<c:forEach var="product" items="${productList}" varStatus="loop">
		<div>
		<form method ="post">
		<p><fmt:message key="title" />: ${ product.pName }</p>
		<p><fmt:message key="price" />: ${ product.priceInEuro } </p>
		
		<c:forEach var="description" items="${ product.description }" varStatus="loop">
		<c:if test ="${ description.langCode == locale }">
		<p>${ description.text } </p>
	 	</c:if>
	 	</c:forEach>
	 	
		<img src=${ product.imageFile } />
		<button type="submit" name="pno" value=${ product.pno }>
		<fmt:message key="addToCart" />
		</button>
		</form>
		</div>
		</c:forEach>

		<p>
			<a href="index.jsp"><fmt:message key="home" /> </a>
			<a href="Cart"><fmt:message key="cart" /> </a>
		</p>
	</fmt:bundle>
</body>
</html>