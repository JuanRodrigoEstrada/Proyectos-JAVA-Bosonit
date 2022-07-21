package com.bosonit.BS3JuanRodrigo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class claseSecundaria implements CommandLineRunner {
    @Override
        public void run(String ...args) throws Exception{

        System.out.println("Hola desde clase secundaria");
    }
}
