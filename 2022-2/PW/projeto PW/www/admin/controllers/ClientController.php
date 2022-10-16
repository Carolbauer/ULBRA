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
        
        $idClient = $this -> clientModel -> insertClient($arrayClients);
        if(isset($_FILES["photo"]) && $_FILES['photo']['name'] !=''){
            $this -> savePhoto($idClient);
        }
        //salvar o arquivo
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
        if(isset($_FILES["photo"]) && $_FILES['photo']['name'] !=''){
            $this -> savePhoto($idClient);
        }
        header('Location:?controller=client&action=listClients');
    }

    public function deleteClient($idClient) {
        $this -> clientModel -> deleteClient($idClient);
        if(is_file("assets/img/client/{$idClient}.jpg")){
            unlink("assets/img/client/{$idClient}.jpg");
        }
        header('Location:?controller=client&action=listClients');
    }

    public function savePhoto($id){
        $foto_temp = $_FILES["photo"]["tmp_name"];	//pega o caminho temporário do arquivo
        $foto_name = $_FILES["photo"]["name"];		//pega o nome

        $extensao = str_replace('.','',strrchr($foto_name, '.')); //strtolower(end(explode('.', $foto_name))); //seleciona a extenção da imagem

        // Carrega a imagem 
        $img = null;

    //Transforma a imagem em JPG
    if ($extensao == 'jpg' || $extensao == 'jpeg') { 
        $img = imagecreatefromjpeg($foto_temp);
    } else if ($extensao == 'png') { 
        $img = imagecreatefrompng($foto_temp);
    } else if ($extensao == 'gif') { 
        $img = imagecreatefromgif($foto_temp); 
    }  else     
        $img = imagecreatefromjpeg($foto_temp); 

    // Se a imagem foi carregada com sucesso, testa o tamanho da mesma
    if ($img) { 
      
	//cria imagem no diretório @imagejpeg($img,"diretorio/".$id_noticia) se já tiver com este nome vai substituir
	$localFile = "assets/img/client/{$id}.jpg";
	imagejpeg($img, $localFile); 
    }
}

}

?>