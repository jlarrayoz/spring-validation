# spring-validation
Le agregamos validación al proyecto spring-pizza

**¿Qué pasos debemos seguir?**

<ol>
	<li>Agregar la dependencia Spring Validation Starter al pom.xml</>
	<li>Declarar las reglas de validación en las clases que se quieran validar </li>
	<li>Especificar donde queremos que se realizen las validaciones (EJ: en el controlador DiseniarPizzaController, método procesarOrden)
	<li>Modificar las vistas que corresponda para mostar las validaciones</li>
	
</ol>

## Agregar dependencias

Para poder utilizar bean validations debemos agregar la siguiente dependencia en el pom.xml:


```xml
<dependency>
	<groupId>org.springframework.boot</groupId> <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
</code>
```

## Varios

Info sobre expresiones regulares:

[https://www.regular-expressions.info/](https://www.regular-expressions.info/)

