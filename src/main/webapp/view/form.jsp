<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="partials/header.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="pt-5 px-5">
<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
    <h1 class="h2">Add Product Form</h1>
</div>
<div class="card shadow">
    <div class="card-body">
        <form:form class="row" action="/form/add" modelAttribute="product">
            <div class="col-sm-5">
                <div class="form-group"><label for="productName">Name</label>
                    <form:input class="form-control" id="productName" path="Name" placeholder="Product Name" cssErrorClass="error"/>
                    <form:errors path="Name" cssErrorClass="errorMessage"/>
                </div>
                <div class="form-group"><label for="productManufacturer">Manufacturer</label>
                    <form:input class="form-control" id="productManufacturer" path="Brand" placeholder="Brand Name"
                                cssErrorClass="error"/>
                    <form:errors path="Brand" cssErrorClass="errorMessage"/>
                </div>
                <div class="form-group"><label for="productSKU">SKU</label>
                    <form:input class="form-control" id="productSKU" type="number" path="Sku" placeholder="SKU Number"
                                cssErrorClass="error"/>
                </div>
                <div class="form-group">
                    <label for="inputColor">Attributes</label>
                    <form:select class="form-control" id="inputColor" path="Color" cssErrorClass="error">
                        <option selected="">Color...</option>
                        <option>Black</option>
                        <option>Blue</option>
                        <option>Red</option>
                        <option>Pink</option>
                        <option>Green</option>
                        <option>Orange</option>
                    </form:select>
                </div>
                <div class="form-group"><label for="exampleFormControlDescription">Description</label><textarea class="form-control" id="exampleFormControlDescription" rows="3"></textarea></div>
            </div>
            <div class="col-sm-1"></div>
            <div class="col-sm-5">
                <div class="avatar-upload">
                    <div class="avatar-edit"><input id="imageUpload" type="file" name="imagePath" accept=".png, .jpg, .jpeg"><label for="imageUpload"></label></div>
                    <div class="avatar-preview">
                        <div id="imagePreview"
                             style="background-image: url(/static/public/img/logo.png);"></div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="form-group col-sm-6">
                        <label for="inputPrice3">Price</label>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend"><span class="input-group-text">$</span></div>
                            <input class="form-control" type="number" name="Price"
                                   aria-label="Amount (to the nearest dollar)">
                            <div class="input-group-append"><span class="input-group-text">.00</span></div>
                        </div>
                    </div>
                    <div class="form-group col-sm-6">
                        <label for="inputPrice3">Cost</label>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend"><span class="input-group-text">$</span></div>
                            <input class="form-control" type="text" name="cost" aria-label="Amount (to the nearest dollar)">
                            <div class="input-group-append"><span class="input-group-text">.00</span></div>
                        </div>
                    </div>
                    <div class="form-group col-md-4">
                        <form:select class="form-control" id="inputQuantity" type="number" path="Stock" cssErrorClass="error">
                            <option selected="">Quantity...</option>
                            <option>1</option>
                            <option>5</option>
                            <option>10</option>
                            <option>25</option>
                            <option>50</option>
                            <option>100</option>
                        </form:select>
                    </div>
                    <div class="form-group col-md-8">
                        <form:input class="form-control" id="productVersion" path="Version"
                                    placeholder="Product Version"
                                    cssErrorClass="error"/>
                        <form:errors path="Version" cssErrorClass="errorMessage"/>
                    </div>
<!--                    <div class="form-group col-md-8">-->
<!--                        <div class="form-check mt-2"><input class="form-check-input" id="gridCheck1" type="checkbox"><label class="form-check-label" for="gridCheck1">In Stock</label></div>-->
<!--                    </div>-->
                    <div class="form-group col-md-12">
                        <button class="btn btn-primary btn-lg btn-block" type="Submit">Submit</button>
                    </div>
                </div>
            </div>
            <div class="col-sm-1"></div>
        </form:form>
    </div>
</div>
</div>

<%@include file="partials/footer.jsp"%>
