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
  <link rel="stylesheet" href="assets/css/style.css"/>
  
  <!--jquery -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <!-- JS -->
  <script src="assets/js/script.js"></script>

  <title>Projeto PW</title>
</head>
<body>
<header class="p-3 text-center bg-dark">
  <h1>Área administrativa</h1>
    <a href ="?controller=main&action=logout">Sair</a>
  
</header>

<div class="container-fluid">
    <div class="row">
    <nav class="navbar bg-ligth col-md-3">
    <ul class="navbar-nav">
        <h2>Menu</h2>
        <li class="nav-item">
            <a class ="nav-link" href="?controller=main&action=index">Home</a>
        </li>
        <h4>Clientes</h4>
        <li class="nav-item">
            <a id="register" class="nav-link" href="?controller=client&action=register">Cadastro</a>
        </li>
        <li class="nav-item">
            <a id="" class="nav-link" href="?controller=client&action=listClients">Listar Clientes</a>
        </li>
    </ul>
    </nav>


    <section class="col-md-9">
      
