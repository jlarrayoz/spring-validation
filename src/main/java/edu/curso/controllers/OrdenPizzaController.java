package edu.curso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.curso.domain.OrdenPizza;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/ordenes")
@SessionAttributes("ordenPizza")
public class OrdenPizzaController {
	
	
	@GetMapping("/actual")
	public String mostrarFormulario() {
		log.info("Redirigiendo a la orden actual");
		return "ordenes";
	}
	
	@PostMapping
	public String procesarOrden(OrdenPizza ordenPizza, SessionStatus sessionStatus) {
		log.info("Procesando la orden de pizza: {}", ordenPizza);
		
		//Como la orden ya fue ingresada, se limpia la sessión para que
		sessionStatus.setComplete();
		return "redirect:/design";
	}
}
