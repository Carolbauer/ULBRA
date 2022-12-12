<?php

namespace App\Models;

use CodeIgniter\Model;

class ClientModel extends Model{

    protected $table = 'clients';
    protected $primaryKey = 'idClient';
    protected $allowedFields = [
        'name', 'email', 'phone', 'address'
    ];
    public function listClients($idClient = null){
        if($idClient == null){
            return $this -> findAll();
        }else{
            return $this -> find($idClient);
        }
    }

    function getClientsfor($search) {
        return $this -> asArray() -> like('idClient', $search)
        -> orLike('name', $search)
        -> orLike('phone', $search)
        -> orLike('email', $search)
        -> orLike('address', $search)
        -> findAll();
    }
}