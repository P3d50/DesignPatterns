package criacionais.factorymethod;

public class EmissorEMail implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Emissor E-Mail");
		System.out.println(mensagem);
		
	}

}
