package neoris.app;

import java.util.List;
import java.util.Scanner;

import neoris.app.domain.Categoria;
import neoris.app.domain.Cliente;
import neoris.app.domain.Empleado;
import neoris.app.domain.Producto;
import neoris.app.domain.Promocion;
import neoris.app.domain.Proveedor;


public class frontend 
{
     public static void main(String[] args)
	{
    	Facade facadeImpl = new FacadeImpl();
 		Scanner scanner = new Scanner(System.in);
 		ReposicionThread rt = new ReposicionThread();
 		rt.start();
 		
 		
 System.out.println(
 					"1)CLIENTES QUE ADQUIRIERON UN PRODUCTO: \n"+
 					"2)EMPLEADOS QUE ATENDIERON A UN CLIENTES: \n"+
 					"3)LISTADO DE LOS PRODUCTOS QUE TIENEN PROMOCIONES EN VIGENCIA: \n"+
 					"4)LISTADO DE LAS PROMOCIONES PARA UN PRODUCTO: \n"+
 					"5)PROVEEDORES POR CATEOGORIA: \n"+
 					"Seleccione una accion: "
 					
 				);
 		int accion = scanner.nextInt();
 		
 		switch(accion)
		{
			case 1:
			{
				List<Producto> productos = facadeImpl.obtenerProductos();
				
				for(Producto pro:productos)
				{
					System.out.println(pro.getId_producto()+": "+pro.getDescripcion());
				}
				System.out.print("Seleccione producto: ");
				int idProducto = scanner.nextInt();
				
				
				List<Cliente> clientes = facadeImpl.obtenerClientesQueAdquirieron(idProducto);
				for(Cliente cli:clientes) {
					System.out.println(cli.getId_cliente()+ ": "+ cli.getNombre());
				}
				break;
			}
			case 2:{
				List<Cliente> cliente = facadeImpl.obtenerClientes();
				
				for(Cliente cli:cliente) {
					System.out.println(cli.getId_cliente()+": "+ cli.getNombre());
				}
				
				System.out.print("Seleccione Cliente: ");
				int idCliente = scanner.nextInt();
				
				List<Empleado> empleados = facadeImpl.obtenerEmpleadosQueAntendieron(idCliente);
				
				for(Empleado em:empleados) {
					System.out.println(em.getId_empleado()+": "+em.getNombre());
				}
				break;
			}
			case 3:{
				List<Producto> producto =facadeImpl.obtenerProductosConPromocionesVigentes();
		 		for(Producto pro:producto) {
		 			System.out.println(pro.getId_producto()+": "+pro.getDescripcion());
		 		}
				break;
			}
			case 4:{
				List<Producto> productos = facadeImpl.obtenerProductos();
				for(Producto pro:productos)
				{
					System.out.println(pro.getId_producto()+": "+pro.getDescripcion());
				}
				System.out.print("Seleccione producto: ");
				int idProducto = scanner.nextInt();
				List<Promocion> promocion = facadeImpl.obtenerPromociones(idProducto);
				for(Promocion prom:promocion) {
					System.out.println(prom.getId_promocion_producto()+": "+prom.getDescuento());
				}
				break;
			}
			case 5:{
				List<Categoria> categorias = facadeImpl.obtenerCategorias();
				for(Categoria cat:categorias) {
					System.out.println(cat.getIdCategoria()+": "+cat.getDescripcion());
				}
				System.out.print("Seleccione categoria: ");
				int idCategoria = scanner.nextInt();
				
				
				List<Proveedor> proveedor = facadeImpl.obtenerProveedores(idCategoria);
				for(Proveedor prov:proveedor) {
					System.out.println(prov.getId_proveedor()+": "+prov.getEmpresa());
				}
				break;
			}
			
			default:
				throw new IllegalArgumentException("Ingrese un numero correcto");
		}
 		
 		
 	}
}
