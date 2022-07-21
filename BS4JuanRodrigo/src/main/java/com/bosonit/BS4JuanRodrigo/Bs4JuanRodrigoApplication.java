package com.bosonit.BS4JuanRodrigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Bs4JuanRodrigoApplication {

	@Autowired
	private valores valores;

	public static void main(String[] args) {
		SpringApplication.run(Bs4JuanRodrigoApplication.class, args);
	}
	@PostConstruct
	private void postInit(){
		System.out.println("Propiedades de valor info");
		System.out.println(valores);
		System.out.println("var3 no tiene valor");
	}

}
