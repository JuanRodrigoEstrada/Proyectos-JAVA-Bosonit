package com.bosonit.CRUDJuanRodrigo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



public class PersonaServimpl implements PersonaServ {

    List<Persona> peopleList = new ArrayList<>();

    @Override
    public void addPersona(Persona person) {
        peopleList.add(person);
    }

    @Override
    public List<Persona> getListPeople() {
        return peopleList;
    }

    @Override
    public Persona getListPersonbyID(int id) {
        return peopleList.get(id);
    }

    @Override
    public Persona getListPersonbyName(String nombre) {
        Persona persona = peopleList.stream().filter(person -> nombre.equals(person.getNombre())).findAny().orElse(null);

        return persona;


    }
}