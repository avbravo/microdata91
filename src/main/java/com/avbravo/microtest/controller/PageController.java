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
@Named(value = "pageController")
//@RequestScoped
@ApplicationScoped
@Data
public class PageController {
    private static final long serialVersionUID = 1L;
private String view="page";

    /**
     * Creates a new instance of PageController
     */
    public PageController() {
       
    }


    
}
