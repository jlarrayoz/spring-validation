package edu.curso.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import edu.curso.domain.Ingrediente;
import edu.curso.models.IngredienteDAO;


@Component
public class IngredienteConverter implements Converter<String, Ingrediente> {

	@Override
	public Ingrediente convert(String id) {
		return IngredienteDAO.getInstance().getIngredienteById(id).orElseThrow();
	}
}
