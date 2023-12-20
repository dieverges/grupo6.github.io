package infrastructure.persistence.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	// Driver de conexión a la base de datos

	public static Connection getConnection() {

		Connection connection = null;
		String host = "localhost";
		String port = "3306";
		String username = "root";
		String password = "admin";
		String nombredb = "integrador_cac";
		String driveClassName = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driveClassName);
			// url de conexion
			String url = "jdbc:mysql://" + host + ":" + port + "/" + nombredb;
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
