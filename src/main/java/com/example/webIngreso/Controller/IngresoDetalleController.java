package com.example.webIngreso.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.webIngreso.DTO.IngresoDetalleDTO;
import com.example.webIngreso.Service.IDetalleIngresoService;


@Controller
public class IngresoDetalleController {

	@Autowired
	private IDetalleIngresoService ing;
	
	@GetMapping("/listadodetalleingresos")
	public String pagListaDetalle(Model model) {
		List<IngresoDetalleDTO> listapro= ing.obtenerdetalleingreso();
		model.addAttribute("listadodetalle", listapro);
		return "/ingreso/detalleingresos";
	}
	
	
	
	
	
	
	@GetMapping("/borrar")
	public String borrarproducto(@RequestParam(name = "id") Integer id) {
		IngresoDetalleDTO ids=new IngresoDetalleDTO();
		ids.setIdDetalleIngreso(id);
		ing.EliminarIngresoDetalle(ids);
		return "redirect:/listadodetalleingresos";
	}
}
