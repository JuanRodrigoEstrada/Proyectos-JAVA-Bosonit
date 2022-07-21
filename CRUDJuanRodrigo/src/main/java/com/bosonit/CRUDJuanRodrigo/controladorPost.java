package com.bosonit.CRUDJuanRodrigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class controladorPost {

    private AtomicInteger atom = new AtomicInteger();

    @Autowired
    @Qualifier ("Qualifierbean1")

    PersonaServ personaServ;

    @PostMapping(value = "/persona" )
    public PersonaServ addPersona(@RequestBody Persona person){
        person.setId(person.getId());
        personaServ.addPersona(person);
        return personaServ;
    }




}
