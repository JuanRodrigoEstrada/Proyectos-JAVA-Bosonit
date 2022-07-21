package com.bosonit.CRUDJuanRodrigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class controladorDelete {

    private int y;

    @Autowired
    @Qualifier("Qualifierbean1")
    PersonaServ personaServ;

    @DeleteMapping (value = "/persona/{id}")
    public PersonaServ removePersonbyID (@PathVariable (value = "id") int id){
        for (y = 0 ; y < personaServ.getListPeople().size(); y++){
            if(personaServ.getListPeople().get(y).getId()==id){
                personaServ.getListPeople().remove(id - 1);
            }

        }
        return personaServ;
    }


}
