package neoris.app.domain;

public class Producto
{
	private int id_producto;
	private String descripcion;
	private double precio_unitario;
	private int unidades_stock;
	private int unidades_reposicion;
	private int flg_discontinuo;
	private int id_categoria;
	
	public int getId_producto() {
		return id_producto;
	}
	
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecio_unitario() {
		return precio_unitario;
	}
	
	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	
	public int getUnidades_stock() {
		return unidades_stock;
	}
	
	public void setUnidades_stock(int unidades_stock) {
		this.unidades_stock = unidades_stock;
	}
	
	public int getUnidades_reposicion() {
		return unidades_reposicion;
	}
	
	public void setUnidades_reposicion(int unidades_reposicion) {
		this.unidades_reposicion = unidades_reposicion;
	}
	
	public int getFlg_discontinuo() {
		return flg_discontinuo;
	}
	public void setFlg_discontinuo(int flg_discontinuo) {
		this.flg_discontinuo = flg_discontinuo;
	}
	
	public int getId_Categoria() {
		return id_categoria;
	}
	
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	
	
	
}
