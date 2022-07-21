package com.bosonit.BS3JuanRodrigo;


import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Data
@Configuration
public class Persona {
    private String nombre = "Juan Rodrigo";
    private int edad = 38;

    @Bean
    public String getNombre(){
        return nombre;

    }
    @Bean
    public int getEdad(){
        return edad;
    }

}
