package com.bosonit.BS2inyectiondependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlador2 {
    @Autowired
    @Qualifier("getDataPersona")
    PersonaService personaService;

    @Autowired
    CiudadService ciudadService;

    @GetMapping("/controlador2/getPersona")
    public PersonaService getPersonaServiceEdad() {
        personaService.setEdad(personaService.getEdad() * 2);
        return personaService;
    }

    @GetMapping("/controlador2/getCiudad")
    public CiudadService getCiudad(){
        ciudadService.getCiudades();
        return ciudadService;
    }

}