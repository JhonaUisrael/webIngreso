package com.example.webIngreso.DTO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IngresoDTO {

	private int idIngreso;
	private double valor;
	private int cantidad;
	private boolean estado;
	private UsuarioDTO fkusuario;
}
