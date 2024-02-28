package com.example.webIngreso.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.example.webIngreso.DTO.IngresoDetalleDTO;
import com.example.webIngreso.Service.IDetalleIngresoService;
import com.example.webIngreso.Util.ConvertJson;

@Service
public class DetalleIngresoServiceImpl implements IDetalleIngresoService {

	@Autowired
	private RestTemplate restTemplate;

	private String Url = "http://localhost:54530";
	@Override
	public List<IngresoDetalleDTO> obtenerdetalleingreso() {
		String lista = restTemplate.getForObject(Url + "/api/ingresosdetalle", String.class);
		ConvertJson<IngresoDetalleDTO> convert = new ConvertJson<>(IngresoDetalleDTO.class);
		List<IngresoDetalleDTO> listaProductos = convert.ConvertJsonToArray(lista);
		return listaProductos;
	}
	@Override
	public boolean EliminarIngresoDetalle(IngresoDetalleDTO id) {
		try {
			String personResultAsJsonStr = restTemplate.postForObject(Url + "/api/ingresosdetalle/borrar", id,
					String.class);
			return true;
		} catch (Exception e) {
			return false;

		}
	}

}
