<?php
class ClientModel{

    var $connection;

    public function __construct(){
        require_once('db/ConnectClass.php');
        $connectClass = new ConnectClass();
        $connectClass -> openConnect();
        $this -> connection = $connectClass -> getConn();
    }

    public function listClients(){
        $sql = 'SELECT * from clients';
        return $this -> connection -> query($sql);
    }

    public function consultClient($idClient){
        $sql = "
        SELECT * from clients
            WHERE
            idClient = $idClient
        "
        ;
        return $this -> connection -> query($sql);
    }

    public function insertClient($arrayClients){
        $sql = "
        INSERT INTO 
            clients (name,phone,email,address)
        VALUES(
            '{$arrayClients['name']}',
            '{$arrayClients['phone']}',
            '{$arrayClients['email']}',
            '{$arrayClients['address']}'
        )
        ";

        $this -> connection -> query($sql);

        return $this -> connection ->insert_id;
    }
    public function updateClient($arrayClients){
        $sql = "
           UPDATE
              clients
           SET
              name='{$arrayClients['name']}',
              email='{$arrayClients['email']}',
              phone='{$arrayClients['phone']}',
              address='{$arrayClients['address']}'
           WHERE
              idClient = {$arrayClients['idClient']}
        ";
        
        return $this -> connection -> query($sql);
       }

       public function deleteClient($idClient) {
        $sql = "
           DELETE FROM 
              clients 
           WHERE 
              idClient = $idClient
        ";
        return $this -> connection -> query($sql);
       }
}
?>