<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="T" uri="WEB-INF/shortDescription.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping cart</title>
</head>

<style>
table, th, td {
  border:1px solid black;
}
</style>
<body>

	<p><jsp:include page="chooseLanguage.jsp" /></p>

	<fmt:bundle basename="resources.Messages">

		<h1>
			<fmt:message key="cart" />
		</h1>

		<table>
			<col span="5">
			<tr>
				<th><fmt:message key="name" /></th>
				<th><fmt:message key="shortDescription" /></th>
				<th><fmt:message key="price" /></th>
				<th><fmt:message key="quantity" /></th>
				<th><fmt:message key="total" /></th>
			</tr>

			<c:forEach var="product" items="${cart}" varStatus="loop">

				<tr>
					<td style="margin-left:5px;">${ product.pName }</td>
					<c:forEach var="description" items="${ product.shortDescription }"
						varStatus="loop">
						<c:if test="${ description.langCode == locale }">
							<td>${ description.text }</td>
						</c:if>
					</c:forEach>
					<td>${ product.priceInEuro }</td>
					<td>${ product.count }</td>
					<td>${ product.totalPrice }</td>
					

				</tr>
			</c:forEach>
			</table>
			<table>
			<col span="5">
			<tr>
			<td style="padding-left:420px;"><fmt:message key="total" /></td>
			<td>${ totalPrice } </td>
			</tr>
		
			
		</table>
		
		<div>
		<a href="Products"><fmt:message key="products" /> </a>
		</div>
	</fmt:bundle>


</body>
</html>