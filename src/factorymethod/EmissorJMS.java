package factorymethod;

public class EmissorJMS implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Emissor JMS");
		System.out.println(mensagem);
		
	}

}
