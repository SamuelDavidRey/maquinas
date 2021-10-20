/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories;

import com.rentamaquina.maquinaria.app.entities.Machine;
import com.rentamaquina.maquinaria.app.entities.Machine;
import com.rentamaquina.maquinaria.app.repositories.crud.MachineCrudRepository;
import java.util.List;
import java.util.Optional;
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
 public Machine save(Machine machine){
        return machineCrudRepository.save(machine);
    }
  public Machine saveMachine(Machine machine){
     return machineCrudRepository.save(machine);
 } 
 
     public Optional<Machine> getMachine(int machineId){
        return machineCrudRepository.findById(machineId);
    }

    
    public void delete(Machine machine){
        machineCrudRepository.delete(machine);
    }
 
}

