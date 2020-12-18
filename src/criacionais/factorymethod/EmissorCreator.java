package criacionais.factorymethod;

public class EmissorCreator {
	
	public Emissor getEmissor(EmissorType emissorType) {
		 
		Class<?> clazz;
		try {
			clazz = Class.forName("criacionais.factorymethod.Emissor"+emissorType);
			return (Emissor) clazz.newInstance();
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
