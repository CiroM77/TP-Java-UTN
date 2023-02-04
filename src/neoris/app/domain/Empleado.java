package neoris.app.domain;

public class Empleado
{
	private int id_empleado;
	private String nombre;
	private int id_jefe;
	
	public int getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getId_jefe() {
		return id_jefe;
	}
	public void setId_jefe(int id_jefe) {
		this.id_jefe = id_jefe;
	}




}
