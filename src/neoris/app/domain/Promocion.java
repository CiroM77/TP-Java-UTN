package neoris.app.domain;

import java.sql.Date;

public class Promocion
{
	private int id_promocion_producto;
	private int id_promocion_vigencia;
	private int id_producto;
	private Double descuento;
	private Date fecha_inicio;
	private Date fecha_fin;
	
	public int getId_promocion_producto() {
		return id_promocion_producto;
	}
	public void setId_promocion_producto(int id_promocion_producto) {
		this.id_promocion_producto = id_promocion_producto;
	}
	
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	public int getId_promocion_vigencia() {
		return id_promocion_vigencia;
	}
	public void setId_promocion_vigencia(int id_promocion_vigencia) {
		this.id_promocion_vigencia = id_promocion_vigencia;
	}
	
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public Date getFecha_inicio()
	{
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio)
	{
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin()
	{
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin)
	{
		this.fecha_fin = fecha_fin;
	}

	
	
	
}
