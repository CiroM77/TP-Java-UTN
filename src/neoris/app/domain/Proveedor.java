package neoris.app.domain;

public class Proveedor
{
	private int id_proveedor;
	private String empresa;
	private String contacto;
	private String direccion;
	private int id_proveedor_categoria;
	
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getId_proveedor_categoria() {
		return id_proveedor_categoria;
	}
	public void setId_proveedor_categoria(int id_proveedor_categoria) {
		this.id_proveedor_categoria = id_proveedor_categoria;
	}
	
	
}
