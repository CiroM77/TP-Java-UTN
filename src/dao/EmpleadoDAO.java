package dao;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import neoris.app.domain.Empleado;
import test.MiFactory;

public class EmpleadoDAO
{
	public List<Empleado> obtenerEmpleadosQueAntendieron(Object idCliente){
		
		MiJdbc x = MiFactory.getInstance("miJdbc");
		
		String sql="";
		sql+="SELECT id_empleado ";
		sql+="      ,Empleado.nombre ";
		sql+="FROM Cliente, Empleado, Orden ";
		sql+="WHERE id_cliente = ? ";
		sql+="AND Orden.id_empleado = Empleado.id_empleado ";
		sql+="AND Cliente.id_cliente = Orden.id_cliente ";
		
		List<Object[]> le = x.query(sql,idCliente);
		
		List<Empleado> ret = new ArrayList<>();
		for(Object[] fila:le) {
			Empleado em = new Empleado();
			em.setId_empleado((Integer)fila[0]);
			em.setNombre((String)fila[1]);
			ret.add(em);
		}
		return ret;
		
		
	}
	
	
	
	
	
}
