package com.example.webIngreso.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.webIngreso.DTO.ProductoDTO;
import com.example.webIngreso.Service.IProductoService;
import com.example.webIngreso.Util.ConvertJson;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private RestTemplate restTemplate;

	private String Url = "http://localhost:59372";
	
	@Override
	public List<ProductoDTO> obtenerProductos() {
		String lista = restTemplate.getForObject(Url + "/api/productos", String.class);
		ConvertJson<ProductoDTO> convert = new ConvertJson<>(ProductoDTO.class);
		List<ProductoDTO> listaProductos = convert.ConvertJsonToArray(lista);
		return listaProductos;
	}

}
