package com.bosonit.BS2inyectiondependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@Configuration//@Configuration es una anotación encargada de definir que la clase es una clase de configuración para el framework
@RestController//@RestController es un tipo de controller que reciben peticiones con un formato de específico que cumple con formatos de solicitud RESTful habitualmente y mayormente en JSON aunque a veces se usan otros como HTML, XML, o simplemente texto.
public class controlador1 {
    @Autowired//@Autowired sirve para inyectar unas dependencias con otras dentro de Spring .
    @Qualifier("getDataPersona")//@Qualifier sirve para especificar una inyección de dependencia a través de la clase getDataPersona en este caso
    PersonaService personaService;

    @Autowired
    @Qualifier("bean1Qualifier")
    PersonaService personaServiceBean1;

    @Autowired
    @Qualifier("bean2Qualifier")
    PersonaService personaServiceBean2;

    @Autowired
    @Qualifier("bean3Qualifier")
    PersonaService personaServiceBean3;

    @Autowired
    @Qualifier("bean4Qualifier")
    PersonaService personaServiceBean4;

    @Autowired
    CiudadService ciudadService;

    @GetMapping("/controlador1/addPersona")//@GetMapping sirve para manejar las solicitudes HTTP GET que coinciden con la expresión URI dada.
    public PersonaService getPersonaServiceInfo(@RequestHeader("nombre") String nombre, @RequestHeader("poblacion") String poblacion, @RequestHeader("edad") Integer edad) {
        personaService.setNombre(nombre);
        personaService.setPoblacion(poblacion);
        personaService.setEdad(edad);
        //@RequestHeader sirve para la petición de las cabeceras o metadatos del mensaje y se usa cuando hablamos de los campos en este caso nombre poblacion y edad dentro de la clase persona
        return personaService;
    }

    @PostMapping("/controlador1/addCiudad")//@PostMapping sirve para manejar las solicitudes HTTP POST.
    public CiudadService addCiudad(@RequestBody Ciudad c) {
        ciudadService.addCiudad(c);
        return ciudadService;
        //@RequestBody se usa para la petición del cuerpo del mensaje
    }
    //@bean es una anotación que marca como bean cada uno de los métodos de tal forma que esten disponibles para Spring
    @GetMapping("/controlador/bean/{bean}")//
    public PersonaService getNombrePerServ1(@PathVariable String bean) {
        //@PathVariable se usa para elegir opciones de variables
        if (bean.equalsIgnoreCase("bean1")){
            return personaServiceBean1;

        } else if (bean.equalsIgnoreCase("bean2")) {
            return personaServiceBean2;

        } else if (bean.equalsIgnoreCase("bean3")) {
            return personaServiceBean3;

        } else {
            return personaServiceBean4;
        }

    }

}