package neoris.app;

import demo.MiJdbc;

public class ReposicionThread extends Thread
{

	@Override
	public void run()
	{
		int delay=3000;
		Facade f = new FacadeImpl();
		try
		{
			
			while(true) {
				Thread.sleep(delay);
				f.generarReposicionProducto();
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		
	}
	
	
	
}
