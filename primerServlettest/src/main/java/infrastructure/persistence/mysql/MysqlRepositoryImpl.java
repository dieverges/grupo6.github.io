package infrastructure.persistence.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import infrastructure.persistence.IPersistencia;
import modelos.Usuario;

public class MysqlRepositoryImpl implements IPersistencia {

	private Connection connection;

	public MysqlRepositoryImpl() {
		connection = ConexionBD.getConnection();
	}

	@Override
	public void guardar(Usuario newUsuario) {
		String query = "INSERT INTO usuarios (nombre, apellido, email, tema) VALUES (?,?,?,?)";
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, newUsuario.getNombre());
			statement.setString(2, newUsuario.getApellido());
			statement.setString(3, newUsuario.getEmail());
			statement.setString(4, newUsuario.getTema());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Usuario> listarUsuarios() {
		ArrayList<Usuario> usuarios = new ArrayList<>();
		String query = "SELECT * FROM usuarios";
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				// obtener los datos de cada usuario en el resultado
				int idUsuario = resultSet.getInt("idUsuario");
				String nombre = resultSet.getString("nombre");
				String apellido = resultSet.getString("apellido");
				String email = resultSet.getString("email");
				String tema = resultSet.getString("tema");

				// Crear un nuevo objeto Usuario con los datos obtenidos
				Usuario usuario = new Usuario(idUsuario, nombre, apellido, email, tema);
				usuarios.add(usuario);
			}
			// connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	@Override
	public Usuario getUsuarioPorId(String id) {
		return null;
	}

	@Override
	public Usuario update(Usuario usuario) {
		return null;
	}

	@Override
	public void delete(String id) {
	}

}
