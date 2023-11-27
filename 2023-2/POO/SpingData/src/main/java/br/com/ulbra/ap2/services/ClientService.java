package br.com.ulbra.ap2.services;

import br.com.ulbra.ap2.entities.Client;
import br.com.ulbra.ap2.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private ClientRepository repository;

    @Autowired
    public String ClientService(ClientRepository repository) {
        this.repository = repository;

        return "Sucesso";
    }

    public List<Client> getAll(Integer age) {
        if (null != age) {
            return repository.findByAge(age);
        } else {
            return repository.findAll();
        }
    }

    public Client addClient(Client client) {
        return repository.save(client);
    }

    public Client getById(final int id) {
        Optional<Client> optionalClient = repository.findById(id);
        return optionalClient.orElse(null);
    }

    public Client updateClient(final Client clientData, final int id) {

        return this.repository.save(clientData);

    }

    public String delete(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Cliente removido com sucesso";
        } else {
            return "Cliente não encontrado";
        }
    }
}

