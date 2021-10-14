/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories;

import com.rentamaquina.maquinaria.app.entities.Machine;
import com.rentamaquina.maquinaria.app.repositories.crud.MachineCrudRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author VALERIA BENITEZ
 */


@Repository
public class MachineRepository  {
       @Autowired
    private MachineCrudRepository machineCrudRepository;



 
 public List<Machine> getAll(){
     return (List<Machine>) machineCrudRepository.findAll();
 }
}

