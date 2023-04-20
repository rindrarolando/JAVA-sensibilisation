<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Formulaire pour ajouter une actualité</title>

    <!-- Fontfaces CSS-->
    <link href="css/font-face.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href="vendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="vendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/theme.css" rel="stylesheet" media="all">

</head>

<body class="animsition">
    <div class="page-wrapper">
        <!-- HEADER MOBILE-->
        <header class="header-mobile d-block d-lg-none">
            <div class="header-mobile__bar">
                <div class="container-fluid">
                    <div class="header-mobile-inner">
                        <a class="logo" href="/acceuil">
                            <img src="images/icon/logo.png" alt="CoolAdmin" />
                        </a>
                        <button class="hamburger hamburger--slider" type="button">
                            <span class="hamburger-box">
                                <span class="hamburger-inner"></span>
                            </span>
                        </button>
                    </div>
                </div>
            </div>
            <nav class="navbar-mobile">
                <div class="container-fluid">
                    <ul class="navbar-mobile__list list-unstyled">
                        <li>
                            <a href="#">
                                <i class="far fa-check-square"></i>Ajout actualité</a>
                        </li>
                        <li>
                            <a href="/add-information">
                                <i class="fas fa-chart-bar"></i>Ajouter une information</a>
                        </li>
                        <li>
                            <a href="/comments">
                                <i class="fas fa-table"></i>Gestion des commentaires</a>
                        </li>


                    </ul>
                </div>
            </nav>
        </header>
        <!-- END HEADER MOBILE-->

        <!-- MENU SIDEBAR-->
        <aside class="menu-sidebar d-none d-lg-block">
            <div class="logo">
                <a href="/acceuil">
                    <img src="images/icon/logo.png" alt="Cool Admin" />
                </a>
            </div>
            <div class="menu-sidebar__content js-scrollbar1">
                <nav class="navbar-sidebar">
                    <ul class="list-unstyled navbar__list">
                        <li>
                            <a href="#">
                            <i class="far fa-check-square"></i>Ajout actualité</a>
                        </li>
                        <li>
                            <a href="/add-information">
                            <i class="fas fa-chart-bar"></i>Ajouter une information</a>
                        </li>
                        <li>
                            <a href="/comments">
                             <i class="fas fa-table"></i>Gestion des commentaires</a>
                        </li>
                    </ul>
                </nav>
            </div>
        </aside>
        <!-- END MENU SIDEBAR-->

        <!-- PAGE CONTAINER-->
        <div class="page-container">
            <!-- HEADER DESKTOP-->
            <header class="header-desktop">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="header-wrap">
                            <form class="form-header" action="" method="POST">
                                <input class="au-input au-input--xl" type="text" name="search" placeholder="Search for datas &amp; reports..." />
                                <button class="au-btn--submit" type="submit">
                                    <i class="zmdi zmdi-search"></i>
                                </button>
                            </form>
                            <div class="header-button">

                                <div class="account-wrap">
                                    <div class="account-item clearfix js-item-menu">
                                        <div class="image">
                                            <img src="images/icon/avatar-01.jpg" alt="John Doe" />
                                        </div>
                                        <div class="content">
                                            <a class="js-acc-btn" href="#">ADMIN</a>
                                        </div>
                                        <div class="account-dropdown js-dropdown">
                                            <div class="info clearfix">
                                                <div class="image">
                                                    <a href="#">
                                                        <img src="images/icon/avatar-01.jpg" alt="John Doe" />
                                                    </a>
                                                </div>
                                                <div class="content">
                                                    <h5 class="name">
                                                        <a href="#">Compte administrateur</a>
                                                    </h5>
                                                    <span class="email">Gestion du back office</span>
                                                </div>
                                            </div>
                                            <div class="account-dropdown__body">
                                                <div class="account-dropdown__item">
                                                    <a href="#">
                                                        <i class="zmdi zmdi-account"></i>Account</a>
                                                </div>

                                            </div>
                                            <div class="account-dropdown__footer">
                                                <a href="/logout">
                                                    <i class="zmdi zmdi-power"></i>Logout</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <!-- HEADER DESKTOP-->

            <!-- MAIN CONTENT-->
            <div class="main-content">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="row">


                            <div class="col-lg-12">
                                                            <div class="card">
                                                                <div class="card-header">
                                                                    <strong>Formulaire pour ajouter une actualité </strong>
                                                                </div>
                                                                <div class="card-body card-block">
                                                                    <form action="/upload-new" method="post" class="form-horizontal">

                                                                        <div class="row form-group">
                                                                            <div class="col col-md-3">
                                                                                <label for="text-input" class=" form-control-label">Titre</label>
                                                                            </div>
                                                                            <div class="col-12 col-md-9">
                                                                                <input type="text" id="text-input" name="titre" placeholder="titre..." class="form-control">
                                                                                <small class="form-text text-muted">Le titre du contenu</small>
                                                                            </div>
                                                                        </div>

                                                                        <div class="row form-group">
                                                                            <div class="col col-md-3">
                                                                                <label for="text-input" class=" form-control-label">Url affiché </label>
                                                                            </div>
                                                                            <div class="col-12 col-md-9">
                                                                                <input type="text" id="text-input" name="url" placeholder="url rewriting..." class="form-control">
                                                                                <small class="form-text text-muted">L`url qui s`affichera sur la barre de navigation , chaque mot séparé par un `-`</small>
                                                                            </div>
                                                                        </div>


                                                                        <div class="row form-group">
                                                                            <div class="col col-md-3">
                                                                                <label for="textarea-input" class=" form-control-label">Description</label>
                                                                            </div>
                                                                            <div class="col-12 col-md-9">
                                                                                <textarea name="description" id="textarea-input" rows="9" placeholder="Contenu..." class="form-control"></textarea>
                                                                            </div>
                                                                        </div>

                                                                        <div class="row form-group">
                                                                                                                        <div class="col col-md-3">
                                                                                                                            <label for="file-input" class=" form-control-label">Photo correspondante</label>
                                                                                                                        </div>
                                                                                                                        <div class="col-12 col-md-9">
                                                                                                                            <input type="text" id="text-input" name="photo" placeholder="url de la photo..." class="form-control">
                                                                                                                            <small class="form-text text-muted">Le nom du fichier de l`image correspondante.</small>
                                                                                                                        </div>
                                                                                                                    </div>



                                                                        <button type="submit" class="btn btn-primary btn-sm">
                                                                            <i class="fa fa-dot-circle-o"></i> valider
                                                                        </button>

                                                                    </form>
                                                                </div>
                                                            </div>

                                                        </div>


                        </div>

                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap JS-->
    <script src="vendor/bootstrap-4.1/popper.min.js"></script>
    <script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
    <!-- Vendor JS       -->
    <script src="vendor/slick/slick.min.js">
    </script>
    <script src="vendor/wow/wow.min.js"></script>
    <script src="vendor/animsition/animsition.min.js"></script>
    <script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
    </script>
    <script src="vendor/counter-up/jquery.waypoints.min.js"></script>
    <script src="vendor/counter-up/jquery.counterup.min.js">
    </script>
    <script src="vendor/circle-progress/circle-progress.min.js"></script>
    <script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
    <script src="vendor/chartjs/Chart.bundle.min.js"></script>
    <script src="vendor/select2/select2.min.js">
    </script>

    <!-- Main JS-->
    <script src="js/main.js"></script>

</body>

</html>
<!-- end document-->
