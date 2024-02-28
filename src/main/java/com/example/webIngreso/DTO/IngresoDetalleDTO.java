package com.example.webIngreso.DTO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IngresoDetalleDTO {

	private int idDetalleIngreso;
	private String idProducto;
	private boolean estado;
	private IngresoDTO fkingreso;
}
