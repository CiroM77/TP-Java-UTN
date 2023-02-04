package neoris.app.domain;

public class Cliente
{
	private int id_cliente;
	private int id_usuario;
	private String nombre;
	private String direccion;
	private int id_tipo_cliente;
	private int id_producto;
	
	public int getId_cliente() {
		return id_cliente;
	}
	
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getId_tipo_cliente() {
		return id_tipo_cliente;
	}
	public void setId_tipo_cliente(int id_tipo_cliente) {
		this.id_tipo_cliente = id_tipo_cliente;
	}
	
	private int getId_producto() {
		return id_producto;
	}
	private void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	
}
