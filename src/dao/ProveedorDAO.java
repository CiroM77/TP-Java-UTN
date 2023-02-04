package dao;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import neoris.app.domain.Proveedor;
import test.MiFactory;

public class ProveedorDAO
{
	
	public List<Proveedor> obtenerProveedores(Object idCategoria){
		
		MiJdbc x = MiFactory.getInstance("miJdbc");
		
		String sql="";
		sql+="SELECT id_proveedor ";
		sql+="       ,empresa ";
		sql+="       ,contacto ";
		sql+="       ,direccion ";
		sql+="       ,id_proveedor_categoria ";
		sql+="FROM proveedor, proveedor_categoria ";
		sql+="WHERE id_categoria = ? ";
		sql+="AND proveedor.id_proveedor = proveedor_categoria.id_proveedor ";
		
		List<Object[]> lpc = x.query(sql, idCategoria);
		
		List<Proveedor> ret = new ArrayList<>();
		for(Object[] fila:lpc) {
			Proveedor pro = new Proveedor();
			pro.setId_proveedor((Integer)fila[0]);
			pro.setEmpresa((String)fila[1]);
			pro.setContacto((String)fila[2]);
			pro.setDireccion((String)fila[3]);
			pro.setId_proveedor_categoria((Integer)fila[4]);
			ret.add(pro);
		}
		return ret;
		
		
		
		
	}
	
	
}
