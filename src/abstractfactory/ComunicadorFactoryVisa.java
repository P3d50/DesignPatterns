package abstractfactory;

import factorymethod.Emissor;
import factorymethod.EmissorSMS;

public class ComunicadorFactoryVisa implements ComunicadorFactory{

	@Override
	public Emissor createEmissor() {
		System.out.println("criando emissor Visa");
		return  new EmissorVisa();
	}

	@Override
	public Receptor createReceptor() {
		System.out.println("criando receptor Visa");
		return  new ReceptorVisa();
	}

}
