package criacionais.abstractfactory;

import criacionais.factorymethod.Emissor;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		ComunicadorAbstractFactory factory = new ComunicadorAbstractFactory();
		 
		ComunicadorFactory visa = factory.getComunicadorFactory(Bandeira.Visa);
		Emissor emissorVisa = visa.createEmissor();
		emissorVisa.envia("K19 - Treinamentos");
		
		Receptor receptorVisa = visa.createReceptor();
		receptorVisa.recebe();
		
		ComunicadorFactory master = factory.getComunicadorFactory(Bandeira.Master);
		Emissor emissorMaster = master.createEmissor();
		emissorMaster.envia("K19 - Treinamentos");
		
		Receptor receptorMaster = master.createReceptor();
		receptorMaster.recebe();
	}

}
