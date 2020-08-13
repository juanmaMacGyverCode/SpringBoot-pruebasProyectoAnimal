package com.educacionanimal.application.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @RequestMapping("/presentation")
    public String displayPresentation() {
        return "Hola mundo presentacion MODIFICACION HOLA HOLA";
    }

    @RequestMapping("/virtual-visit")
    public String displayVirtualVisit() {
        return "Hola mundo visita virtual";
    }

    @RequestMapping("/volunteering")
    public String displayVolunteering() {
        return "Hola mundo voluntario";
    }

    @RequestMapping("/responsible-care")
    public String displayResponsibleCare() {
        return "Hola mundo responsable";
    }

    @RequestMapping("/animal-protection")
    public String displayAnimalProtection() {
        return "Hola mundo protección";
    }

    @RequestMapping("/adoption")
    public String displayAdoption() {
        return "Hola mundo adopción";
    }

    @RequestMapping("/euthanasia")
    public String displayEuthanasia() {
        return "Hola mundo eutanasia";
    }

    @RequestMapping("/game")
    public String displayGame() {
        return "Hola mundo juego";
    }
}
