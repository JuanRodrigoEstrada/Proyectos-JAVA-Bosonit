package com.bosonit.BS3JuanRodrigo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class claseInicial {
    @PostConstruct
    public void primeraFuncion(){
        System.out.println("Hola desde clase inicial");
    }
}
