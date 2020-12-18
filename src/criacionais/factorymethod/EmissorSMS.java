package criacionais.factorymethod;

public class EmissorSMS implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Emissor SMS");
		System.out.println(mensagem);
		
	}

}
