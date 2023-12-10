package br.com.ulbra.ap2.controller;

import br.com.ulbra.ap2.dtos.ClientResponseDto;
import br.com.ulbra.ap2.entities.Client;
import br.com.ulbra.ap2.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService service;


    @Autowired
    public ClientController(final ClientService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ClientResponseDto getById(@PathVariable final int id){
        return this.service.getById(id);
    }

    @GetMapping
    public List<Client> getAll(@RequestParam(name = "age", required = false) final Integer age){
        return service.getAll(age);
    }
    @PostMapping
    public ClientResponseDto addClient(@RequestBody final ClientResponseDto bodyRequest){
        service.addClient(bodyRequest);
         return bodyRequest;
    }

    @PutMapping("/{id}")
    public Client updateClient(@RequestBody final Client clientData, @PathVariable final int id){
        return service.updateClient(clientData, id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable final int id){
        return service.delete(id);
    }

}
