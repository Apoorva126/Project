<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>Product

</head>

<body>
<form action ="<c:url value='/addProduct'/>" method="post">
<table align="center" class="table">
<tr>
<td colspan="2">
<center><h3>Product</h3></center>
</td>
</tr>
<tr>
<td>Product Name</td>
<td><input type="text" name="proName"/></td>
</tr>
<tr>
<td>Product Desc </td>
<td><input type="text" name="proDesc"/></td>
</tr>
<tr>
<td colspan="2">
<center><input type="submit" value="Add Product"/></center>
</td> 
</tr>
</table>
</form>
<table class="table-bordered">
<tr>
<td>Product ID</td>
<td>Product Name</td>
<td>Product Desc</td>
<td>Operations</td>
</tr>
<c:forEach items="${listProducts}" var="product">
<tr>
<td>${product.productID}</td>
<td>${product.productName}</td>
<td>${product.productDesc}</td>
<td>
<a href="<c:url value="/editProduct/${product.productID}"/>" class="btn btn-success">Edit</a>/
<a href="<c:url value="/deleteProduct/${product.productID}"/>" class="btn btn-danger">DELETE</a>
</td>
</tr>

</c:forEach>
</table>
</body>
</html>