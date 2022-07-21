package com.bosonit.CRUDJuanRodrigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class controladorGet {

    @Autowired

    @Qualifier("Qualifierbean1")

    PersonaServ personaServ;

    @GetMapping(value = "/persona/{id}")
    public Persona getPersonbyID (@PathVariable (value = "id" ) int id){

        return personaServ.getListPersonbyID(id -1);

    }
    @GetMapping(value = "/persona/nombre/{nombre}")
    public Persona getPersonbyname(@PathVariable(value = "name")String nombre){
        return personaServ.getListPersonbyName(nombre);
    }


}
