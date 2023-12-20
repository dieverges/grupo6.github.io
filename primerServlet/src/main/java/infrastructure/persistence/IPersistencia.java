package infrastructure.persistence;

import java.util.ArrayList;

import modelos.Usuario;

public interface IPersistencia {

	// CRUD //
	
	// CREATE
	void guardar(Usuario newUsuario);
	
	// READ
	ArrayList<Usuario> listarUsuarios();
	Usuario getUsuarioPorId(String id);
	
	// UPDATE
	Usuario update(Usuario usuario);
	
	// DELETE
	void delete(String id);
	
	
	
}
