package com.bosonit.CRUDJuanRodrigo;

import java.util.List;

public interface PersonaServ {
    void addPersona(Persona person);

    List<Persona>getListPeople();

    Persona getListPersonbyID(int id);

    Persona getListPersonbyName(String nombre);
}
