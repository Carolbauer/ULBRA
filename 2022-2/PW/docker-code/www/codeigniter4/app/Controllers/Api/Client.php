<?php

namespace App\Controllers\Api;

use App\Controllers\BaseController;
use App\Models\ClientModel;

class Client extends BaseController
{
    public function __construct()
    {
        $this->ClientModel = new ClientModel();
    }


    public function listClientsApi(){
        $data = [
            $this -> ClientModel -> findAll()
        ];
        return $this->response->setjson($data);
    }
}