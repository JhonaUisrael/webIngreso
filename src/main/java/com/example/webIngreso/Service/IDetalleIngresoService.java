package com.example.webIngreso.Service;

import java.util.List;

import com.example.webIngreso.DTO.IngresoDetalleDTO;

public interface IDetalleIngresoService {

	public List<IngresoDetalleDTO> obtenerdetalleingreso();
	
	public boolean EliminarIngresoDetalle(IngresoDetalleDTO id);
}
