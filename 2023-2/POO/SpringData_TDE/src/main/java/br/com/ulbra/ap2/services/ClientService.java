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
    public ClientService(final ClientRepository repository) {
        this.repository = repository;

    }

    public List<Client> getAll(Integer age) {

        final List<Client> clientsResult= this.repository.findAll();
        if (clientsResult.isEmpty()){
            throw new ClientNotFoundException();
        }
        return clientsResult;
    }

    public ClientResponseDto addClient(final ClientResponseDto client) {
         Client ClientDtoClient = new Client( client.getName(), client.getAge(), client.getProfession());
         Client resultadosave = repository.save(ClientDtoClient);

        return client;
    }
    public Client addClient(final Client client) {
        return this.repository.save(client);
    }
    public Client updateClient(final Client clientData, final int id) {

        return repository.save(clientData);

    }
    public Client getById(final int id) {
        final Optional<Client> optionalClient = repository.findById((long) id);
        return optionalClient.orElse(null);
    }
    public String delete(final int id) {
        if (this.repository.existsById((long) id)) {
            this.repository.deleteById((long) id);
            return "Cliente removido com sucesso";
        } else {
            return "Cliente não encontrado";
        }
    }
    public void deleteAllClients() {
        repository.deleteAll();
    }
}

