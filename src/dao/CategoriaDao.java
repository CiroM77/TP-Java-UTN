package dao;

import java.util.ArrayList;
import java.util.List;


import demo.MiJdbc;
import neoris.app.domain.Categoria;
import test.MiFactory;

public class CategoriaDao
{
		
	public List<Categoria> findAll() {
	
	
	MiJdbc x = MiFactory.getInstance("miJdbc");
	List<Object[]> lc = x.query("SELECT * FROM categoria");
	
	List<Categoria> ret = new ArrayList<>();
	for(Object[] fila:lc)
	{
		Categoria cat = new Categoria();
		cat.setIdCategoria((Integer)fila[0]);
		cat.setDescripcion((String)fila[1]);
		ret.add(cat);
	}
	
	return ret;
	
	}
	
}