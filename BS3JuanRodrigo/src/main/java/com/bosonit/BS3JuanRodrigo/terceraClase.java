package com.bosonit.BS3JuanRodrigo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class terceraClase {

    @Bean
    CommandLineRunner ejecutame (Persona person){
        return args -> {
            System.out.println("Hola , soy la tercera clase , me llamo " + person.getNombre() + " y tengo la edad de " + person.getEdad() + "años");
        };
    }



}
