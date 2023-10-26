package br.com.ulbra.ap2.services;

import br.com.ulbra.ap2.models.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientService {
    private static int id =1;
   private final ArrayList<Client> listClients = new ArrayList();
    public ArrayList <Client> getListClients(){
        return this.listClients;
    }
    public Client addClient(Client client){
        client = new Client(ClientService.id,client.name(), client.age(),client.profession());
        ClientService.id++;
        listClients.add(client);
        return client;
    }

    public Client getById(final int id){
       for (int i = 0; i < listClients.size(); i++){
           if(listClients.get(i).id() == id){
               return listClients.get(i);
           }

        }
        return null;
    }
    public ArrayList<Client> getAll(final Integer age){
         final ArrayList <Client> filtrados = new ArrayList();
        if(null != age){
            for(int i = 0; i < this.listClients.size(); i++){
                if(this.listClients.get(i).age() == age){
                    filtrados.add(this.listClients.get(i));
                }

            }
            return filtrados;
        }
        return this.listClients;
    }

    public String updateClient(final Client client, final int id)
    {
        for(int i = 0; i < this.listClients.size(); i++){
            if(listClients.get(i).id() == id){
                this.listClients.set(i, client);
                break;
            }
        }
        return "Cliente atualizado com sucesso";
    }

    public String delete(final int id){
        for(int i = 0; i < listClients.size(); i++){
            if(listClients.get(i).id() == id){
                listClients.remove(i);
                return "Cliente removido com sucesso";
            }
        }
        return "Cliente não encontrado";
    }
}

