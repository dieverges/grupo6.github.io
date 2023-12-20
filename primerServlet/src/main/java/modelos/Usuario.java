package modelos;

import java.util.UUID;

public class Usuario {
	private static int contador;

	private int id;
	private UUID idUsuario;
	private String nombre;
	private String apellido;
	private String email;
	private String tema;

	public Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = ++contador;
		this.idUsuario = UUID.randomUUID();
	}

	public Usuario(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idUsuario = UUID.randomUUID();
	}

	public Usuario(String nombre, String apellido, String email, String tema) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.tema = tema;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public UUID getIdUsuario() {
		return idUsuario;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTema() {
		return this.tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + this.id + ", nombre=" + this.nombre + ", apellido=" + this.apellido + ", email="
				+ this.email + ", tema=" + this.tema + "]";
	}

}
