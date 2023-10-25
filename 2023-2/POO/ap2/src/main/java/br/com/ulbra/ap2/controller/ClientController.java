package br.com.ulbra.ap2.controller;

import br.com.ulbra.ap2.models.Client;
import br.com.ulbra.ap2.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private ClientService service;
    @Autowired
    public ClientController(ClientService service) {
        this.service = service;
    }
    @GetMapping
    public ArrayList<Client> getAll(@RequestParam(name = "age", required = false) Integer age){
        return service.getAll(age);
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable int id){
        return service.getById(id);
    }
    @PostMapping
    public String addClient(@RequestBody Client client){
        return service.addClient(client);
    }

    @PutMapping("/{id}")
    public String updateClient(@RequestBody Client clientData, @PathVariable final int id){
        return this.service.updateClient(clientData, id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return this.service.delete(id);
    }

}
