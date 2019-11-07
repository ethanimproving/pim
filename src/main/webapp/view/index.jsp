<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="partials/header.jsp"%>

<!-- TABLE-->
<div class="pt-5 px-5">
    <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
        <h1 class="h2">Dashboard</h1>
        <div class="btn-toolbar mb-2 mb-md-0">
            <div class="btn-group mr-2"><button class="btn btn-sm btn-outline-secondary">Share</button><button class="btn btn-sm btn-outline-secondary">Export</button></div>
            <button class="btn btn-sm btn-outline-secondary dropdown-toggle"><span data-feather="calendar"></span>                          This week</button>
        </div>
    </div>
    <h2>Products</h2>
    <div class="table-responsive">
        <table class="table table-striped table-sm">
            <thead>
            <tr>
                <th>Name</th>
                <th>Price</th>
                <th>Stock</th>
                <th>Version</th>
                <th>Brand</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td>${product.getName()}</td>
                    <td>${product.getPrice()}</td>
                    <td>${product.getStock()}</td>
                    <td>${product.getVersion()}</td>
                    <td>${product.getBrand()}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<%@include file="partials/footer.jsp"%>

