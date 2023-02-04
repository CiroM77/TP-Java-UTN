package neoris.app.domain;

import java.sql.Date;

public class Reposicion
{
	private int id_reposicion;
	private int id_producto;
	private int cantidad;
	private Date fecha;
	
	public int getId_reposicion()
	{
		return id_reposicion;
	}
	public void setId_reposicion(int id_reposicion)
	{
		this.id_reposicion = id_reposicion;
	}
	public int getCantidad()
	{
		return cantidad;
	}
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	public Date getFecha()
	{
		return fecha;
	}
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}
	public int getId_producto()
	{
		return id_producto;
	}
	public void setId_producto(int id_producto)
	{
		this.id_producto = id_producto;
	}
	
}
