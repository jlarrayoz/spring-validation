package edu.curso.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class OrdenPizza {
	
	//Datos de la entrega
	private String nombrePersona;
	private String ciudad;
	private String barrio;
	private String direccion;
	
	//Datos de la tarjeta de crédito
	private String nroTarjeta;
	private String fecVencimiento;
	private String codigoCVV;
	
	//Lo que ordenó
	private List<Pizza> pizzas = new ArrayList<>();
	
	public void addPizza(Pizza pizzza) {
		pizzas.add(pizzza);
	}
}
