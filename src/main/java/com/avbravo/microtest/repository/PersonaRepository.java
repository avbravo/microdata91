/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microtest.repository;

import com.avbravo.jmoordbcdi.RepositoryDecorator;
import jakarta.enterprise.context.ApplicationScoped;

//import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

/**
 *
 * @author avbravo
 */
@ApplicationScoped
@Named

public class PersonaRepository extends RepositoryDecorator<Persona, String>{

    

  
    
}
