package dao;

import java.util.List;

import demo.MiJdbc;
import test.MiFactory;

public class ReposicionDAO
{
	public void generarReposicion() {
		
	MiJdbc x = MiFactory.getInstance("miJdbc");
	String sql="";
	sql+="INSERT INTO Reposicion(id_producto, cantidad, fecha) ";
	sql+="SELECT id_producto, (unidades_stock_maximo - unidades_stock) ";
	sql+="AS cantidad, CURRENT_DATE ";
	sql+="FROM Producto ";
	sql+="WHERE unidades_stock < unidades_stock_minimo ";
	sql+="AND NOT EXISTS(SELECT id_producto FROM reposicion)";
	int reposicionesAgru = x.update(sql);
	
	System.out.println("Reposiciones agregadas: " + reposicionesAgru);
	
	}
	
}
