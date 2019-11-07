<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="partials/header.jsp"%>

<div class="pt-5 px-5">
<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
    <h1 class="h2">Add Product Form</h1>
</div>
<div class="card shadow">
    <div class="card-body">
        <form class="row" method="POST" action="/form/add">
            <div class="col-sm-5">
                <div class="form-group"><label for="productName">Name</label><input class="form-control"
                                                                                    id="productName" type="text"
                                                                                    name="Name" placeholder="Product Name"></div>
                <div class="form-group"><label for="productManufacturer">Manufacturer</label><input
                        class="form-control" id="productManufacturer" type="text" name="Brand"
                        placeholder="Brand Name"></div>
                <div class="form-group"><label for="productSKU">SKU</label><input class="form-control" id="productSKU" type="name" name="sku" placeholder="SKU Number"></div>
                <div class="form-group">
                    <label for="inputQuantity">Attributes</label>
                    <select class="form-control" id="inputQuantity" name="color">
                        <option selected="">Color...</option>
                        <option>Black</option>
                        <option>Blue</option>
                        <option>Red</option>
                        <option>Pink</option>
                        <option>Green</option>
                        <option>Orange</option>
                    </select>
                </div>
                <div class="form-group"><label for="exampleFormControlDescription">Description</label><textarea class="form-control" id="exampleFormControlDescription" rows="3"></textarea></div>
            </div>
            <div class="col-sm-1"></div>
            <div class="col-sm-5">
                <div class="avatar-upload">
                    <div class="avatar-edit"><input id="imageUpload" type="file" name="imagePath" accept=".png, .jpg, .jpeg"><label for="imageUpload"></label></div>
                    <div class="avatar-preview">
                        <div id="imagePreview"
                             style="background-image: url(static/public/img/logo.png);"></div>
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
                        <select class="form-control" id="inputQuantity" type="number" name="Stock">
                            <option selected="">Quantity...</option>
                            <option>1</option>
                            <option>5</option>
                            <option>10</option>
                            <option>25</option>
                            <option>50</option>
                            <option>100</option>
                        </select>
                    </div>
                    <div class="form-group col-md-8">
                        <div class="form-check mt-2"><input class="form-check-input" id="gridCheck1" type="checkbox"><label class="form-check-label" for="gridCheck1">In Stock</label></div>
                    </div>
                    <div class="form-group col-md-12">
                        <button class="btn btn-primary btn-lg btn-block" type="Submit">Submit</button>
                    </div>
                </div>
            </div>
            <div class="col-sm-1"></div>
        </form>
    </div>
</div>
</div>

<%@include file="partials/footer.jsp"%>
