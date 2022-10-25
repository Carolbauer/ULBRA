<?php
class ClientController{

    var $ClientModel;

    public function __construct(){
        require_once('models/ClientModel.php');
        $this ->ClientModel = new ClientModel();
    }

    public function listClients(){
        $result = $this -> ClientModel -> listClients();
        $arrayClients = array();
        while ($line = $result -> fetch_assoc()){
            array_push($arrayClients, $line);
        }

        header('Content-Type: application/json');
        echo json_encode($arrayClients);
    }

    public function consultClient($id_client){
    $result = $this->ClientModel->consultClient($id_client);
    if ($arrayClient = $result->fetch_assoc()) {
      header('Content-type: application/json');
      echo json_encode($arrayClient);
    } else {
      header('Content-type: application/json');
      echo(
        '{
            "error":"1",
            "message":"Cliente não encontrado"
          }') ;
    }
  }

    public function insertClient(){
        $client = json_decode(file_get_contents("php://input"));
        $arrayClient = (array) $client;
        $this -> ClientModel -> insertClient ($arrayClient);
        header('Content-Type: application/json');
        echo('
            {
                "error": "1",
                "message": "Cliente inserido";
            }'
        );
    }

    public function updateClient($idClient){
        $client = json_decode(file_get_contents("php://input"));
        $arrayClient = (array) $client;
        $this -> ClientModel -> updateClient ($idClient, $arrayClient);
        header('Content-Type: application/json');
        echo('
            {
                "error": "2",
                "message": "Cliente alterado";
            }'
        );
    }

    public function deleteClient($idClient){
        $this -> ClientModel -> deleteClient ($idClient);
        header('Content-Type: application/json');
        echo('
            {
                "error": "3",
                "message": "Cliente deletado";
            }'
        );

    }

}

?>