package entidades;

public class Persona {
	
	private String Nombre;
	private String Apellido;
	private String Dni;
	private Boolean Habilitado;
	
	private String getNombre() {
		return Nombre;
	}
	private void setNombre(String nombre) {
		Nombre = nombre;
	}
	private String getApellido() {
		return Apellido;
	}
	private void setApellido(String apellido) {
		Apellido = apellido;
	}
	private String getDni() {
		return Dni;
	}
	private void setDni(String dni) {
		Dni = dni;
	}
	private Boolean getHabilitado() {
		return Habilitado;
	}
	private void setHabilitado(Boolean habilitado) {
		Habilitado = habilitado;
	}
	
	public void Persona(String nombre, String apellido, String dni, Boolean habilitado)
	{
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setHabilitado(habilitado);
	}
}
