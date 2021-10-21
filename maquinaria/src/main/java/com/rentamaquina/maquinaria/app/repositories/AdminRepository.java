/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories;

import com.rentamaquina.maquinaria.app.entities.Admin;
import com.rentamaquina.maquinaria.app.entities.Admin;
import com.rentamaquina.maquinaria.app.repositories.crud.AdminCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author VALERIA BENITEZ
 */
@Repository
public class AdminRepository {
    @Autowired
    private AdminCrudRepository adminCrudRepository;



 
 public List<Admin> getAll(){
     return (List<Admin>) adminCrudRepository.findAll();
 }
 
 public Admin saveAdmin(Admin admin){
     return adminCrudRepository.save(admin);
 } 
    public Admin save(Admin admin){
        return adminCrudRepository.save(admin);
    }
    
    //pendiente idadmin
    public Optional<Admin> getAdmin(int idAdmin){
        return adminCrudRepository.findById(idAdmin);
    }

    
    public void delete(Admin admin){
        adminCrudRepository.delete(admin);
    }
}
