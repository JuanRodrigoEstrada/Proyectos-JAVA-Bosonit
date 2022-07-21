package com.bosonit.BS2inyectiondependencies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bs2inyectiondependenciesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bs2inyectiondependenciesApplication.class, args);
	}

	@Bean// @bean es una anotación que marca como bean cada uno de los métodos de tal forma que esten disponibles para Spring
	@Qualifier("getDataPersona")
	public PersonaService getPersonaService() {
		PersonaService personaService = new PersonaServiceimpl();
		return personaService;

	}
	@Bean
	@Qualifier("bean1Qualifier")
	public PersonaService getPersonaServiceBean1() {
		PersonaService persServ1 = new PersonaServiceimpl();
		persServ1.setNombre("bean1");
		return persServ1;
	}

	@Bean
	@Qualifier("bean2Qualifier")
	public PersonaService getPersonaServiceBean2() {
		PersonaService persServ2 = new PersonaServiceimpl();
		persServ2.setNombre("bean2");
		return persServ2;
	}

	@Bean
	@Qualifier("bean3Qualifier")
	public PersonaService getPersonaServiceBean3() {
		PersonaService persServ3 = new PersonaServiceimpl();
		persServ3.setNombre("bean3");
		return persServ3;
	}

	@Bean
	@Qualifier("bean4Qualifier")
	public PersonaService getPersonaServiceBean4() {
		PersonaService persServ4 = new PersonaServiceimpl();
		persServ4.setNombre("Parámetro incorrecto");
		return persServ4;
	}



}
