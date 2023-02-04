package dao;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import neoris.app.domain.Promocion;
import test.MiFactory;

public class PromocionDAO
{
	public List<Promocion> ObtenerPromociones(Object idProducto){
		
		MiJdbc x = MiFactory.getInstance("miJdbc");
		
		String sql ="";
		sql+="SELECT DISTINCT id_promocion_producto ";
		sql+="      ,descuento ";
		sql+="FROM promocion_producto pp, promocion_vigencia pv ";
		sql+="WHERE id_producto = ? ";
		sql+="AND pp.id_promocion_vigencia = pv.id_promocion_vigencia ";
		
		List<Object[]> lpv = x.query(sql, idProducto);
		
		List<Promocion> ret = new ArrayList<>();
		for(Object[] fila:lpv) {
			Promocion pro = new Promocion();
			pro.setId_promocion_producto((Integer)fila[0]);
			pro.setDescuento((Double)fila[1]);
			ret.add(pro);
		}
		
		return ret;
		
	}
	
	
	
}
