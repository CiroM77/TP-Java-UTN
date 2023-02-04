package neoris.app;

import java.util.List;

import dao.CategoriaDao;
import dao.ClienteDAO;
import dao.EmpleadoDAO;
import dao.ProductoDAO;
import dao.PromocionDAO;
import dao.ProveedorDAO;
import dao.ReposicionDAO;
import demo.MiJdbc;
import neoris.app.domain.Categoria;
import neoris.app.domain.Cliente;
import neoris.app.domain.Empleado;
import neoris.app.domain.Producto;
import neoris.app.domain.Promocion;
import neoris.app.domain.Proveedor;
import test.MiFactory;

public class FacadeImpl implements Facade
{

	private static final Object IdPro=null;

	@Override
	public List<Producto> obtenerProductos()
	{
		ProductoDAO pdao = new ProductoDAO();
		 return pdao.findAllP();
	}

	@Override
	public List<Cliente> obtenerClientesQueAdquirieron(int idProducto)
	{
		ClienteDAO cdao = new ClienteDAO();
		return cdao.listaClientes(idProducto);
	}

	@Override
	public List<Cliente> obtenerClientes()
	{
		ClienteDAO cldao = new ClienteDAO();
		return cldao.findAllCli();
	}

	@Override
	public List<Empleado> obtenerEmpleadosQueAntendieron(int idCliente)
	{
		EmpleadoDAO edao = new EmpleadoDAO();
		return edao.obtenerEmpleadosQueAntendieron(idCliente);
	}

	@Override
	public List<Producto> obtenerProductosConPromocionesVigentes()
	{
		ProductoDAO ppdao = new ProductoDAO();
		return ppdao.productoConPromocion();
		
	}

	@Override
	public List<Promocion> obtenerPromociones(int idProducto)
	{
		PromocionDAO prdao = new PromocionDAO();
		return prdao.ObtenerPromociones(idProducto);
		
	}

	@Override
	public List<Categoria> obtenerCategorias()
	{
		CategoriaDao cdao = new CategoriaDao();
		return cdao.findAll();
	}

	@Override
	public List<Proveedor> obtenerProveedores(int idCategoria)
	{
		ProveedorDAO pvdao = new ProveedorDAO();
		return pvdao.obtenerProveedores(idCategoria);
	}

	@Override
	public void generarReposicionProducto()
	{
		ReposicionDAO rdao = new ReposicionDAO();
		rdao.generarReposicion();
 		
	}

}
