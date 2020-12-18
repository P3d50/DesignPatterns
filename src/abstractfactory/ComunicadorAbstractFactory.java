package abstractfactory;

import factorymethod.Emissor;

public class ComunicadorAbstractFactory {
	
	public ComunicadorFactory getComunicadorFactory(Bandeira bandeira) {
		
		 Class clazz;
			try {
				clazz = Class.forName("abstractfactory.ComunicadorFactory"+bandeira);
				return (ComunicadorFactory) clazz.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null; 
			 
		
		
	}

}
