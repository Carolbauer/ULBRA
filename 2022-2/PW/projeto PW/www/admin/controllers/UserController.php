<?php
class UserController
{
  public function validateLogin()
  {
    $userName = $_POST['userName'];
    $password = $_POST['password'];
    require_once('models/UserModel.php');
    $UserModel = new UserModel();

    $result = $UserModel->consultUser($userName);

    if ($client = $result->fetch_assoc()) {
      if ($password == $client['password']) {
        $_SESSION['user'] = $client;
        header('Location: index.php');
      } else {
        echo 'Senha inválida';
      }
    } else {
      echo 'Usuário não existe';
    }
  }
}