package edu.curso.models;


import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import edu.curso.domain.Ingrediente;
import edu.curso.domain.TipoIngrediente;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class IngredienteDAO {

	private static Map<String, Ingrediente> ingredientes;
	
	static {
		
		ingredientes = new HashMap<>();
		
		ingredientes.put("MC", new Ingrediente("MC", "Masa Común", TipoIngrediente.MASA));
		ingredientes.put("MM", new Ingrediente("MM", "Masa Madre", TipoIngrediente.MASA));
		ingredientes.put("MIT",new Ingrediente("MIT", "Masa italiana", TipoIngrediente.MASA));
		ingredientes.put("QM", new Ingrediente("QM", "Queso muzzarella", TipoIngrediente.QUESO));
		ingredientes.put("QD", new Ingrediente("QD", "Queso dambo", TipoIngrediente.QUESO));
	}

	@Getter(lazy = true)
	private static final IngredienteDAO instance = new IngredienteDAO();

	
	public List<Ingrediente> getAll() {
		return new ArrayList<Ingrediente>(ingredientes.values());
	}
	
	public Optional<Ingrediente> getIngredienteById(String id){
		return Optional.ofNullable(ingredientes.get(id));
	}
}
