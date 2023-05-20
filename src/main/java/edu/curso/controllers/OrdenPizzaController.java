package edu.curso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.curso.domain.OrdenPizza;
import jakarta.validation.Valid;
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
	
	/**
	 * Método encargado de procesar la orden del cliente
	 * Observar como se utiliza bean validation
	 * @param ordenPizza
	 * @param sessionStatus
	 * @return
	 */
	@PostMapping
	public String procesarOrden(@Valid OrdenPizza ordenPizza, Errors errores, SessionStatus sessionStatus) {
		log.info("Procesando la orden de pizza: {}", ordenPizza);
		
		if (errores.hasErrors()) {
			log.error("Se encontraror errores al validar: {}", errores.getAllErrors());
			return "ordenes";
		}
		
		//Como la orden ya fue ingresada, se limpia la sessión para que
		sessionStatus.setComplete();
		return "redirect:/";
	}
}
