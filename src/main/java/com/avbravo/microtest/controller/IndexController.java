/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.microtest.controller;

//import jakarta.annotation.PostConstruct;
import com.avbravo.microtest.repository.PersonaRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Named(value = "indexController")
@SessionScoped
@Data
public class IndexController implements Serializable {
private static final long serialVersionUID = 1L;
    private String name = "";


    @Inject
    PageController pageController;
    @Inject
PersonaRepository oerPersonaRepository;
    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
    }

    @PostConstruct
    public void init() {
        try {
            name= "";
            System.out.println("Init....");
        } catch (Exception e) {
            showInfo(e.getLocalizedMessage());
        }

    }

    @PreDestroy
    private void cleanup() {
        // Close the connection to the DataSource.
// 
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String saludar() {
        try {
            
       
        System.out.println("Hola: " + name + " ... ");
        String text = "Hola : "+name + " pageController{"+pageController.getName()+" "+pageController.getData()+"} ";
            System.out.println("Text "+text);
        showInfo(text);
        
         } catch (Exception e) {
             showError("saludar()" +e.getLocalizedMessage());
        }
        return "";
    }

    public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }

    public void showInfo(String content) {
        addMessage(FacesMessage.SEVERITY_INFO, content, "info");
    }

    public void showWarn(String content) {
        addMessage(FacesMessage.SEVERITY_WARN, content, "warn");
    }

    public void showError(String content) {
        addMessage(FacesMessage.SEVERITY_ERROR, content, "message");
    }

    public void showSticky() {
        FacesContext.getCurrentInstance().addMessage("sticky-key", new FacesMessage(FacesMessage.SEVERITY_INFO, "Sticky Message", "Message Content"));
    }

    public void showMultiple() {
        addMessage(FacesMessage.SEVERITY_INFO, "Message 1", "Message Content");
        addMessage(FacesMessage.SEVERITY_INFO, "Message 2", "Message Content");
        addMessage(FacesMessage.SEVERITY_INFO, "Message 3", "Message Content");
    }

}
