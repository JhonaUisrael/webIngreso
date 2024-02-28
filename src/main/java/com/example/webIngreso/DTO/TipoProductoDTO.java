package com.example.webIngreso.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TipoProductoDTO {

	private String idTipo;
	private String nombreTipo;
	private boolean estado;
	private String productos;
}