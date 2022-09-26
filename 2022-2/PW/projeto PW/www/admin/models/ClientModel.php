<?php
class ClientModel{

    public function listClients(){
        require_once('db/ConnectClass.php');
        $connectClass = new ConnectClass();
        $connectClass -> openConnect();
        $connection = $connectClass -> getConn();

        $sql = 'SELECT * from clients';

        return $connection -> query($sql);
    }

    public function detailsClient($idClient){
        require_once('db/ConnectClass.php');
        $connectClass = new ConnectClass();
        $connectClass -> openConnect();
        $connection = $connectClass -> getConn();

        $sql = "
        SELECT * from clients
            WHERE
            idClient = $idClient
        "
        ;

        return $connection -> query($sql);
    }
}
?>