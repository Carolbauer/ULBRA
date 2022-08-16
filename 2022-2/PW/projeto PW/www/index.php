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
  <script src="assets/JS/script.js"></script>
    
  <title>Projeto PW</title>
</head>
<body>
    <h2>Menu</h2>
    <ul class="nav flex-column">
        <li class="nav-item">
            <a id="btnHome" class="nav-link" href="?pages=home">Home</a>
        </li>
        <li id="btnAbout" class="nav-item">
            <a class="nav-link" href="?pages=about">Sobre</a>
        </li>
        <li id="btncontato" class="nav-item">
            <a class="nav-link" href="?pages=about">Contatos</a>
        </li>

        <?php
        include('templates/header.php');
        if (isset($_GET['pages'])) {
            if ($_GET['pages'] == 'home') {
              include('pages/home.php');
            }
            if ($_GET['pages'] == 'about') {
                include('pages/about.php');
              }
              if ($_GET['pages'] == 'contato'){
                include('pages/contatos.php');
              }
          }else{
            include('pages/home.php');
          }
          include('templates/footer.php');
          ?>


    
</body>
</html>
