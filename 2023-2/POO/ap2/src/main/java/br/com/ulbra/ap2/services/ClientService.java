package br.com.ulbra.ap2.services;

import br.com.ulbra.ap2.models.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientService {
   private ArrayList<Client> listClients = new ArrayList();
    public ArrayList <Client> getListClients(){
        return listClients;
    }
    public String addClient(Client client){
        this.listClients.add(client);
        return "Cliente adicionado com sucesso";
    }

    public Client getById( int id){
       for (int i = 0; i < this.listClients.size(); i++){
           if(this.listClients.get(i).id() == id){
               return this.listClients.get(i);
           }

        }
        return null;
    }
    public ArrayList<Client> getAll(Integer age){
         ArrayList <Client> filtrados = new ArrayList();
        if(null != age){
            for(int i = 0; i < listClients.size(); i++){
                if(listClients.get(i).age() == age){
                    filtrados.add(listClients.get(i));
                }

            }
            return filtrados;
        }
        return listClients;
    }

    public String updateClient(Client client, int id)
    {
        for(int i = 0; i < listClients.size(); i++){
            if(this.listClients.get(i).id() == id){
                listClients.set(i, client);
                break;
            }
        }
        return "Cliente atualizado com sucesso";
    }

    public String delete(int id){
        for(int i = 0; i < this.listClients.size(); i++){
            if(this.listClients.get(i).id() == id){
                this.listClients.remove(i);
                return "Cliente removido com sucesso";
            }
        }
        return "Cliente não encontrado";
    }
}

