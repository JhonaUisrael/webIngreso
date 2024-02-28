package com.example.webIngreso.DTO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioDTO {

	private int idUsuario;
	private String nombres;
	private String apellidos;
	private String identificacion;
	private boolean estado;
}
