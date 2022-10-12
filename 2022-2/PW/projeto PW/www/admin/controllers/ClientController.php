<?php

class ClientController{

    var $clientModel;

    public function __construct(){
        if(!isset ($_SESSION ['user'])){
            header('Location:?controller=main&action=login');
        }
        require_once('models/ClientModel.php');
        $this -> clientModel = new ClientModel();
    }

    public function listClients(){
        $result = $this -> clientModel -> listClients();
        $arrayClients = array();
        while($client = $result -> fetch_assoc()){
            array_push($arrayClients, $client);
        }

        require_once('views/templates/header.php');
        require_once('views/client/listClients.php');
        require_once('views/templates/footer.php');
    }

    public function detailsClient($idClient){
        $result = $this -> clientModel -> consultClient($idClient);
        if ($arrayClients = $result->fetch_assoc()){
            require_once('views/templates/header.php');
            require_once('views/client/detailsClient.php');
            require_once('views/templates/footer.php');
        }

        
    }

    public function insertClient(){
            require_once('views/templates/header.php');
            require_once('views/client/insertClient.php');
            require_once('views/templates/footer.php');
    }

    public function insertClientAction(){
        $arrayClients =array(
            'name'=> $_POST['name'],
            'phone'=> $_POST['phone'],
            'email' => $_POST['email'],
            'address' => $_POST['address']

        );
        
        $this -> clientModel -> insertClient($arrayClients);
        header('Location:?controller=client&action=listClients');
    }

    public function updateClient($idClient){
        $result = $this -> clientModel -> consultClient($idClient);
        if ($arrayClients = $result->fetch_assoc()){
            require_once('views/templates/header.php');
            require_once('views/client/updateClient.php');
            require_once('views/templates/footer.php');
    }

    }

    public function updateClientAction($idClient) {
        $arrayClients =array(
            'idClient' => $idClient,
            'name' => $_POST['name'],
            'phone' => $_POST['phone'],
            'email' => $_POST['email'],
            'address' => $_POST['address']
        );
        $this -> clientModel -> updateClient($arrayClients);
        header('Location:?controller=client&action=listClients');
    }

    public function deleteClient($idClient) {
        $this -> clientModel -> deleteClient($idClient);
        header('Location:?controller=client&action=listClients');
    }
}
    

?>