package mappers;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Usuario;

public class MapperJson {
	ObjectMapper mapper;

	public MapperJson() {
		this.mapper = new ObjectMapper();
	}

	public String toJson(Usuario usuario) {
		try {
			return mapper.writeValueAsString(usuario);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String toJson(ArrayList<Usuario> listaUsuarios) {
		try {
			return mapper.writeValueAsString(listaUsuarios);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "[]";
		}
	}

}
