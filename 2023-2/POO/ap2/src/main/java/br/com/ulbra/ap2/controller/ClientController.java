package br.com.ulbra.ap2.controller;

import br.com.ulbra.ap2.models.Client;
import br.com.ulbra.ap2.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService service;
    @Autowired
    public ClientController(final ClientService service) {
        this.service = service;
    }
    @GetMapping
    public ArrayList<Client> getAll(@RequestParam(name = "age", required = false) final Integer age){
        return this.service.getAll(age);
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable final int id){
        return this.service.getById(id);
    }
    @PostMapping
    public Client addClient(@RequestBody final Client client){
        return this.service.addClient(client);
    }

    @PutMapping("/{id}")
    public String updateClient(@RequestBody final Client clientData, @PathVariable int id){
        return service.updateClient(clientData, id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable final int id){
        return service.delete(id);
    }

}
