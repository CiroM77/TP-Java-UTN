package dao;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import neoris.app.domain.Producto;
import test.MiFactory;


public class ProductoDAO
{
	

	public List<Producto> findAllP(){

	MiJdbc x = MiFactory.getInstance("miJdbc");
	String sql ="";
	sql+="SELECT id_producto ";
	sql+="      ,descripcion ";
	sql+="      ,precio_unitario ";
	sql+="      ,unidades_stock ";
	sql+="      ,flg_discontinuo ";
	sql+="FROM Producto ";

			
			
	List<Object[]> lp = x.query(sql);
	
	List<Producto> ret = new ArrayList<>();
	for(Object[] fila:lp ) {
		Producto dto = new Producto();
		dto.setId_producto((Integer)fila[0]);
		dto.setDescripcion((String)fila[1]);
		dto.setPrecio_unitario((Double)fila[2]);
		dto.setUnidades_stock((Integer)fila[3]);
		ret.add(dto);
	}
	return ret;
	
	
	}
	
	public List<Producto> productoConPromocion(){
		
		MiJdbc x = MiFactory.getInstance("miJdbc");
		
		String sql="";
		sql+="SELECT DISTINCT p.id_producto ";
		sql+="      ,p.descripcion ";
		sql+="FROM producto p, promocion_producto pp, promocion_vigencia pv ";
		sql+="WHERE p.id_producto = pp.id_producto ";
		sql+="AND pv.id_promocion_vigencia = pp.id_promocion_vigencia ";
//		sql+="AND pv.fecha_inicio<=NOW ";
//		sql+="AND pv.fecha_fin>=NOW ";
//		
		List<Object[]> lppv = x.query(sql);
		
		List<Producto> ret = new ArrayList<>();
		
		for(Object[] fila:lppv) {
			Producto producto= new Producto();
			producto.setId_producto((Integer)fila[0]);
			producto.setDescripcion((String)fila[1]);
			ret.add(producto);
		}
		
		return ret;
	}
	
}
