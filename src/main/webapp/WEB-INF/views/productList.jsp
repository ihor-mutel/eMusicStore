<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> <%--import spring tags--%>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>All products</h1>
            <p class="lead">Checkout all the awesome products avalaible now!</p>
        </div>
        <table class="table table-stripped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Photo thumb</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Condition</th>
                <th>Price</th>
            </tr>
            </thead>
            <%--standart js library (c:) and products is the productList--%>
            <%--that we attachet to the model--%>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td><img src="#" alt="image"/></td>
                    <td>${product.productName}</td>
                    <td>${product.productCategory}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productPrice} USD</td>
                </tr>
            </c:forEach>
        </table>

<%@include file="/WEB-INF/views/template/footer.jsp"%>