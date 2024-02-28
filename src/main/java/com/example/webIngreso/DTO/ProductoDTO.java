package com.example.webIngreso.DTO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductoDTO {

	private String idProducto;
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean estado;
	private TipoProductoDTO tipoProducto;

}