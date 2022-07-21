package com.bosonit.CRUDJuanRodrigo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class beanConfig {



    @Bean
    @Primary
    @Qualifier("Qualifierbean1")
    public PersonaServ getPersonaServicebean1() {

        PersonaServ personServ1 = new PersonaServimpl();
        personServ1.getListPeople().add(new Persona("pers1","pobl1",1,2));

            return personServ1;


    }
    @Bean
    @Qualifier("Qualifierbean2")
    public PersonaServ getPersonaServicebean2() {

        PersonaServ personServ1 = new PersonaServimpl();
        personServ1.getListPeople().add(new Persona("pers2","pobl1",1,2));

        return personServ1;


    }
}