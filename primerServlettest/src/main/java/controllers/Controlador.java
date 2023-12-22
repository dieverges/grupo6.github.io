package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import infrastructure.persistence.IPersistencia;
import infrastructure.persistence.mysql.MysqlRepositoryImpl;
import mappers.MapperJson;
import modelos.Usuario;

public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IPersistencia persistence = new MysqlRepositoryImpl();
	private MapperJson mapper = new MapperJson();

	public Controlador() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Usuario> lista = persistence.listarUsuarios();
		String listaUsuariosJson = mapper.toJson(lista);

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(listaUsuariosJson);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtener parámetros del formulario

		String nombre = request.getParameter("nombreInput");
		String apellido = request.getParameter("apellidoInput");
		String email = request.getParameter("emailInput");
		String tema = request.getParameter("temaInput");
		// Crear un objeto Usuario con los datos obtenidos
		Usuario usuario = new Usuario(nombre, apellido, email, tema);
		// Persistir el usuario
		persistence.guardar(usuario);
		// usamos Jackson como dependencia que agregamos al pom.xml

		String usuarioJson = mapper.toJson(usuario);
		response.getWriter().write(usuarioJson);
	}

}
