package br.com.ulbra.ap2.services;

import br.com.ulbra.ap2.dtos.ClientResponseDto;
import br.com.ulbra.ap2.entities.Client;
import br.com.ulbra.ap2.exceptions.ClientNotFoundException;
import br.com.ulbra.ap2.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> getAll(final Integer age) {
        List<Client> clientsResult = repository.findAll();
        if (clientsResult.isEmpty()) {
            throw new ClientNotFoundException();
        }
        return clientsResult;
    }

    public ClientResponseDto addClient(ClientResponseDto client) {
        Client ClientDtoClient = new Client( client.getName(), client.getAge(), client.getProfession());
        Client resultadosave = this.repository.save(ClientDtoClient);
        return client;
    }



    public ClientResponseDto getById(int id) {    final Optional<Client> optionalClient = this.repository.findById((long) id);    if (optionalClient.isEmpty()) {        throw new ClientNotFoundException();    }    Client client = optionalClient.get();    return new ClientResponseDto(client.getName(), client.getAge(), client.getProfession());}

    public Client updateClient(Client clientData, int id) {

        return this.repository.save(clientData);

    }

    public String delete(int id) {
        if (repository.existsById((long) id)) {
            repository.deleteById((long) id);
            return "Cliente removido com sucesso";
        } else {
            return "Cliente não encontrado";
        }
    }
}

