/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories;


import com.rentamaquina.maquinaria.app.entities.Category;
import com.rentamaquina.maquinaria.app.repositories.crud.CategoryCrudRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author VALERIA BENITEZ
 */

@Repository
public class CategoryRepository  {
    
       @Autowired
    private CategoryCrudRepository categoryCrudRepository;



 
 public List<Category> getAll(){
     return (List<Category>) categoryCrudRepository.findAll();
 }
}
