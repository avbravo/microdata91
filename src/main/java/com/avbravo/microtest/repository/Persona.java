/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microtest.repository;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Data
public class Persona implements Serializable {
    private String name;

    public Persona() {
    }
    
    
}
