package abstractfactory;

import factorymethod.Emissor;
import factorymethod.EmissorSMS;

public class ComunicadorFactoryMaster implements ComunicadorFactory{

	@Override
	public Emissor createEmissor() {
		System.out.println("Criando emissor Master");
		return new EmissorMaster();
	}

	@Override
	public Receptor createReceptor() {
		System.out.println("Criando receptor Master");
		return new ReceptorMaster();
	}

}
