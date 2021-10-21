/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.services;

import com.rentamaquina.maquinaria.app.entities.Client;
import com.rentamaquina.maquinaria.app.repositories.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author VALERIA BENITEZ
 */
@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;
    
    
    public List<Client> getAll(){
        
        return repository.getAll();        
    }
    
    public Optional<Client> getClient(int clientId){
        return repository.getClient(clientId);
    }
    
     
    public Client save(Client client){
        if(client.getIdClient()==null){
            return repository.save(client);
        }else{
            Optional<Client> resultado = repository.getClient(client.getIdClient());
            if(resultado.isPresent()){
                return client;
            }else{
                return repository.save(client);
            }
        }
    }
    
    /**
     * UPDATE
     * @param client
     * @return 
     */
    public Client update(Client client){
        if(client.getIdClient() != null){
            Optional<Client> resultado = repository.getClient(client.getIdClient());
            if(resultado.isPresent()){
                if(client.getEmail()!=null){
                    resultado.get().setEmail(client.getEmail());
                }
                if(client.getPassword()!=null){
                    resultado.get().setPassword(client.getPassword());
                }
                if(client.getName()!=null){
                    resultado.get().setName(client.getName());
                }
                if(client.getAge()!=null){
                    resultado.get().setAge(client.getAge());
                }
                
                
                repository.save(resultado.get());
                return resultado.get();
            }else{
                return client;
            }
        }else{
            return client;
        }
    }
    
    /**
     * DELETE
     * @param clientId
     * @return 
     */
    public boolean deleteClient(int clientId) {
        Boolean aBoolean = getClient(clientId).map(client -> {
            repository.delete(client);
            return true;
        }).orElse(false);
        return aBoolean;
    }
   
    
}
