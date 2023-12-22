package modelos;

public class Usuario {

	private int idUsuario;
	private String nombre;
	private String apellido;
	private String email;
	private String tema;

	public Usuario(String nombre, String apellido, String email, String tema) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.tema = tema;
	}

	public Usuario(int idUsuario, String nombre, String apellido, String email, String tema) {
		this.idUsuario = idUsuario;
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

	public int getIdUsuario() {
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
		return "Usuario [id=" + this.idUsuario + ", nombre=" + this.nombre + ", apellido=" + this.apellido + ", email="
				+ this.email + ", tema=" + this.tema + "]";
	}

}