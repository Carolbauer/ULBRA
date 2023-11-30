package br.com.ulbra.ap2.services;

import br.com.ulbra.ap2.dtos.ClientDto;
import br.com.ulbra.ap2.entities.Client;
import br.com.ulbra.ap2.exceptions.ClientNotFoundException;
import br.com.ulbra.ap2.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private ClientRepository repository;

    @Autowired
    public String ClientService(final ClientRepository repository) {
        this.repository = repository;

        return "Sucesso";
    }

    public List<Client> getAll() {

        final List<Client> clientsResult= this.repository.findAll();
        if (clientsResult.isEmpty()){
            throw new ClientNotFoundException();
        }
        return clientsResult;
    }
    public ClientDto addClient(final ClientDto client) {
        final Client ClientDtoClient = new Client( client.getName(), client.getAge(), client.getProfession());
        final Client resultadosave = repository.save(ClientDtoClient);
        return client;
    }

    public Client addClient(final Client client) {
        return this.repository.save(client);
    }

    public Client getById(int id) {
        final Optional<Client> optionalClient = this.repository.findById((long) id);
        return optionalClient.orElse(null);
    }

    public Client updateClient(final Client clientData, final int id) {

        return repository.save(clientData);

    }

    public String delete(final int id) {
        if (this.repository.existsById((long) id)) {
            this.repository.deleteById((long) id);
            return "Cliente removido com sucesso";
        } else {
            return "Cliente não encontrado";
        }
    }
}

