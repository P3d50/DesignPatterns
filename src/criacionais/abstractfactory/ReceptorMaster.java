package criacionais.abstractfactory;

public class ReceptorMaster implements Receptor{

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem ReceptorMaster");
		return "K19 - Treinamentos";
	}

}
