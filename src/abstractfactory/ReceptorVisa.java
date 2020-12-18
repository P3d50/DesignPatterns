package abstractfactory;

public class ReceptorVisa implements Receptor{

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem ReceptorVisa");
		return "K19 - Treinamentos";
	}

}
