<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Inventory</title>
    <!-- Example Page-->
    <link rel="icon" href="/static/public/img/favicon.ico">
    <link rel="stylesheet" href="/static/public/bootstrap-4.0.0-dist/css/bootstrap.css">
    <link rel="stylesheet" href="/static/public/bootstrap-4.0.0-dist/css/bootstrap-grid.css">
    <link rel="stylesheet" href="/static/public/bootstrap-4.0.0-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/public/bootstrap-4.0.0-dist/css/bootstrap-reboot.css">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/dashboard/">
    <link rel="stylesheet" href="/static/public/css/stylesheet.css">
</head>
<!-- NAVBAR-->
<div class="container-fluid">
    <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar" id="sidebar">
            <div class="sidenav">
                <div id="logo"><img src="/static/public/img/logo.png" alt=""></div>
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link active" href="/">
                            <span data-feather="home"></span>
                                 Dashboard <span class="sr-only">(current)
                             </span>
                         </a></li>
                    <li class="nav-item"><a class="nav-link" href="/"><span
                    data-feather="shopping-cart"></span>
                                          Products</a></li>
                    <li class="nav-item"><a class="nav-link" href="/form"><span
                    data-feather="layers"></span>
                                Add Product</a></li>
                    <li class="nav-item"><a class="nav-link" href="#"><span data-feather="file"></span>                      Orders</a></li>
                    <li class="nav-item dropdown dropright"><a class="nav-link dropdown-toggle" data-toggle="dropdown"><span data-feather="users"></span>                      Customers</a>
                        <div class="dropdown-menu" x-placement="right-start" style="position: absolute; transform: translate3d(248px, 0px, 0px); top: 0px; left: 0px; will-change: transform;"><a class="dropdown-item" href="#">Link 1</a><a class="dropdown-item" href="#">Link 2</a><a class="dropdown-item" href="#">Link 3</a></div>
                    </li>
                    <li class="nav-item"><a class="nav-link" href="#"><span data-feather="bar-chart-2"></span>                      Reports</a></li>
                </ul>
                <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted"><span>Saved reports</span><a class="d-flex align-items-center text-muted" href="#"><span data-feather="plus-circle"></span></a></h6>
                <ul class="nav flex-column mb-2">
                    <li class="nav-item"><a class="nav-link" href="#"><span data-feather="file-text"></span>                      Current month</a></li>
                    <li class="nav-item"><a class="nav-link" href="#"><span data-feather="file-text"></span>                      Last quarter</a></li>
                    <li class="nav-item"><a class="nav-link" href="#"><span data-feather="file-text"></span>                      Social engagement</a></li>
                    <li class="nav-item"><a class="nav-link" href="#"><span data-feather="file-text"></span>                      Year-end sale</a></li>
                </ul>
            </div>
        </nav>
        <main class="col-md-9 ml-sm-auto col-lg-10 remove-padding" role="main">
            <!-- NAVBAR-->
            <nav class="navbar navbar-expand-md navbar-dark bg-dark">
                <!-- MOBILE HAMBURGET MENU--><button class="navbar-toggler collapsed" type="button" data-toggle="collapse" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="navbar-collapse collapse justify-content-end">
                    <div class="md-form mt-0"><input class="form-control" type="text" placeholder="Search" aria-label="Search"></div>
                    <ul class="navbar-nav">
                        <li class="nav-item active"><a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a></li>
                        <li class="nav-item"><a class="nav-link" href="/login">Login</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Register</a></li>
                        <li class="nav-item dropdown"><a class="nav-link disabled" href="#">Cart</a></li>
                    </ul>
                </div>
            </nav>
