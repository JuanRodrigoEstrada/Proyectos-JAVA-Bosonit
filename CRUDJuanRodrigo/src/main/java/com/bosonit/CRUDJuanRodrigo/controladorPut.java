package com.bosonit.CRUDJuanRodrigo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controladorPut {

    @Autowired

    PersonaServ personaServ;

    private int x;


    @PutMapping (value = "/persona/{id}")
    public PersonaServ updatePers(@PathVariable(value = "id") int id){

        for( x = 0 ; x < personaServ.getListPeople().size(); x++){
            if (personaServ.getListPeople().get(x).getId() == id) {
                personaServ.getListPeople().get(id - 1).setNombre("Juan Rodrigo");
                personaServ.getListPeople().get(id - 1).setEdad(38);
                personaServ.getListPeople().get(id - 1).setPoblacion("Majadahonda");
            }

        }
        return personaServ;
    }


}
