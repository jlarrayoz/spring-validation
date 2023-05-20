package edu.curso.domain;

import java.util.List;

import lombok.Data;

@Data
public class Pizza {
	
	private String nombre;
	
	private List<Ingrediente> ingredientes;
}
