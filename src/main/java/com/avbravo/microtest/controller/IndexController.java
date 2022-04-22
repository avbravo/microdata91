/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.microtest.controller;

//import jakarta.annotation.PostConstruct;
import com.avbravo.jmoordbcdi.util.ClassUtil;
import com.avbravo.jmoordbcdi.util.FacesMessagesUtil;
import com.avbravo.microtest.model.Persona;
import com.avbravo.microtest.repository.PersonaRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Named(value = "indexController")
@SessionScoped
@Data
public class IndexController implements Serializable {
    // <editor-fold defaultstate="collapsed" desc="field">
   private List<Persona> personaList = new ArrayList<>();
    private Persona persona = new Persona();
    private static final long serialVersionUID = 1L;
    private String mensaje = "";
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="@Inject">
    @Inject
    PageController pageController;
    @Inject
    PersonaRepository perrsonaRepository;
//    @Inject
//    AdrressRepo adreessRepo;
    // </editor-fold>

    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
    }

    @PostConstruct
    public void init() {
        try {
            mensaje = "";
            System.out.println("Init....");
            personaList = new ArrayList<>();
        } catch (Exception e) {
            FacesMessagesUtil.showInfo(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

    }

    @PreDestroy
    private void cleanup() {
        // Close the connection to the DataSource.
// 
    }

//    public String getName() {
//        return mensaje;
//    }
//
//    public void setName(String mensaje) {
//        this.mensaje = mensaje;
//    }
    public String saludar() {
        try {

            String text = "Bienvenido : " + mensaje + " @Inject pageController{" + pageController.getView() + "} ";
            FacesMessagesUtil.showInfo(text, "saludar()");

        } catch (Exception e) {
            FacesMessagesUtil.showInfo(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return "";
    }

    public String save() {
        try {
//
//            System.out.println("Hola: " + mensaje + " ... ");
//            String text = "Hola : " + mensaje + " pageController{" + pageController.getName() + " " + pageController.getData() + "} ";
//            System.out.println("Text " + text);
//            showInfo(text);
            perrsonaRepository.save(persona);
            FacesMessagesUtil.showInfo("Se guardo el registro", "Mensaje");
        } catch (Exception e) {
            FacesMessagesUtil.showInfo(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return "";
    }

}
