<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>Product

</head>

<body>
<form:form action="Add Product" modelAttribute="product" method="post" enctype="multipart/form-data">  
<table align="center" class="table-bordered">
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
<td>Price </td>
<td><input type="text" name="price"/></td>
</tr>
<tr>
<td>Stock</td>
<td><input type="text" name="stock"/></td>
</tr>
<tr>
<tr>
    <td> Category </td>
    <td> 
        <form:select path="categoryID">
           <form:option value="0" label="--Select List--" />
           <form:options items="${categoryList}" />
        </form:select>
    
    </td>
  </tr>
  
  <tr>
     <td> Supplier </td>
     <td> <form:input path="supplierId" /> </td>
  </tr>
  
  <tr>
     <td> Product Description </td>
     <td> <form:input path="productDesc" /> </td>
  </tr>
  
  <tr>
     <td> Image </td>
     <td> <form:input type="file" path="pimage" /> </td>
  </tr>
  
  <tr>
     <td colspan="2">
<center><input type="submit" value="Add Product"/></center>
</td> 
</tr>
</table>
</form:form>


<table class="table-bordered">
<tr>
<td>Product ID</td>
<td>Product Name</td>
<td>Price</td>
<td>Stock</td>
<td>Supplier</td>
<td>Operations</td>
</tr>
<c:forEach items="${listProducts}" var="product">
<tr>
<td>${product.productID}</td>
<td>${product.productName}</td>
<td>${product.price}</td>
<td>${product.stock}</td>
<td>${product.supplierId}</td>
<td>
<a href="<c:url value="/editProduct/${product.productID}"/>" class="btn btn-success">Edit</a>/
<a href="<c:url value="/deleteProduct/${product.productID}"/>" class="btn btn-danger">DELETE</a>
</td>
</tr>

</c:forEach>
</table>
</body>
</html>