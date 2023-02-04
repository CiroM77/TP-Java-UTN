package dao;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import neoris.app.domain.Cliente;
import test.MiFactory;

public class ClienteDAO
{
	public List<Cliente> listaClientes(Object idProducto){
		
		MiJdbc x = MiFactory.getInstance("miJdbc");
		String sql ="";
		sql+="SELECT id_cliente ";
		sql+="      ,id_usuario ";
		sql+="      ,nombre ";
		sql+="      ,direccion ";
		sql+="      ,id_tipo_cliente ";
		sql+="      ,id_producto ";
		sql+="FROM Cliente, Producto, Detalle_orden, Orden ";
		sql+="WHERE id_producto = ? ";
		sql+="AND Orden.id_orden = Detalle_orden.id_orden ";
		sql+="AND Orden.id_cliente = Cliente.id_cliente ";
		sql+="AND Producto.id_producto = Detalle_orden.id_producto ";
		
		List<Object[]> lcli = x.query(sql,idProducto);
		
		List<Cliente> ret = new ArrayList<>();
		for(Object[] fila:lcli) {
			Cliente cliente = new Cliente();
			cliente.setId_cliente((Integer)fila[0]);
			cliente.setId_usuario((Integer)fila[1]);
			cliente.setNombre((String)fila[2]);
			cliente.setDireccion((String)fila[3]);
			cliente.setId_tipo_cliente((Integer)fila[4]);
			ret.add(cliente);
		}
		return ret;
		
		
	}
	

	public List<Cliente> findAllCli(){

		MiJdbc x = MiFactory.getInstance("miJdbc");
	String sql ="";
	sql+="SELECT id_cliente ";
	sql+="      ,id_usuario ";
	sql+="      ,nombre ";
	sql+="      ,direccion ";
	sql+="      ,id_tipo_cliente ";
	sql+="FROM Cliente ";

						
	List<Object[]> lc = x.query(sql);
	
	List<Cliente> ret = new ArrayList<>();
	for(Object[] fila:lc ) {
		Cliente dto = new Cliente();
		dto.setId_cliente((Integer)fila[0]);
		dto.setId_usuario((Integer)fila[1]);
		dto.setNombre((String)fila[2]);
		dto.setDireccion((String)fila[3]);
		dto.setId_tipo_cliente((Integer)fila[4]);
		// dto.setId_categoria((Integer)fila[6]);
		ret.add(dto);
	}
	return ret;
	
	}
	
}
