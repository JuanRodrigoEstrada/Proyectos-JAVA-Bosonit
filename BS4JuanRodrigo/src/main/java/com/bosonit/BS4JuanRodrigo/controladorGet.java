package com.bosonit.BS4JuanRodrigo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controladorGet {

    @Autowired
    valores valores;

    @GetMapping("GET/valores")
    String getValores()
    {
        return "valor de VAR1 es: " + valores.getVar1() + "Valor de my.Var2 es " + valores.getMyvar2();


    }
    @Autowired

    @GetMapping("GET/var3")
    String valor3(){
        if (valores.getVar3()==null){
            valores.setVar3("var3 no tiene valor");
            System.out.println("var3 no tiene valor");
        }
        return "valor de var3 es " + valores.getVar3();

    }


}

