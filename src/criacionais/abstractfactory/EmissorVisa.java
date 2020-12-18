package criacionais.abstractfactory;

import criacionais.factorymethod.Emissor;

public class EmissorVisa implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem EmissorVisa");

	}

}
