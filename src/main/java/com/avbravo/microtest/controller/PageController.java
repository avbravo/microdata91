/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.microtest.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Named(value = "viewController")
//@RequestScoped
@ApplicationScoped
@Data
public class PageController {
private String name="ARos";
    private String data = "Ok data";
    /**
     * Creates a new instance of PageController
     */
    public PageController() {
        data ="Hola mundo";
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getData() {
//        return data;
//    }
//
//    public void setData(String data) {
//        this.data = data;
//    }
//    
    
    
}
