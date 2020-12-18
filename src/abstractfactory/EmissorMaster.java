package abstractfactory;

import factorymethod.Emissor;

public class EmissorMaster implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem EmissorMaster");
		System.out.println(mensagem);

	}

}
