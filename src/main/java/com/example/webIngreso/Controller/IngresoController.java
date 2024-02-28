package com.example.webIngreso.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class IngresoController {

	@GetMapping("/listadoingresos")
	public String pagListaCategoriaProducto(Model model) {
		//List<ProductoDTO> listaproductos= prod.obtenerProductos();
		//model.addAttribute("listadoproducto", listaproductos);
		return "/ingreso/listaingresos";
	}
}
