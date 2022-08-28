<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!-- Bootstrap -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
  
  <!-- Bootstrap icons -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
  
  <!-- Css -->
  <link rel="stylesheet" href="assets/css/style.css">
  
  <!-- JS -->
  <script src="assets/js/script.js"></script>

  <title>Projeto PW</title>
</head>
<body>
<header class="container-fluid bg-dark">
  <h1 class="text-white text-center p-2 m-0">
    Projeto Programação web
</h1>
</header>
<div class="row">
    <nav class="navbar bg-ligth col-md-3">
    <ul class="navbar-nav">
        <h2>Menu</h2>
        <li class="nav-item">
            <a id="home" class="nav-link" href="?controller=site&action=home">Home</a>
        </li>
        <li class="nav-item">
            <a id="about" class="nav-link" href="?controller=site&action=about">Sobre</a>
        </li>
        <li class="nav-item">
            <a id="produtos" class="nav-link" href="?controller=site&action=produtos">Produtos e Serviços</a>
        </li>
        <li class="nav-item">
            <a id="contact" class="nav-link" href="?controller=site&action=contact">Contatos</a>
        </li>
        <h4>Clientes</h4>
        <li class="nav-item">
            <a id="register" class="nav-link" href="?controller=client&action=register">Cadastro</a>
        </li>
    </ul>
    </nav>


    <section class="col-md-9">
      
