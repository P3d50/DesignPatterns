package criacionais.abstractfactory;

public class ReceptorSMS implements Receptor{

	@Override
	public String recebe() {
		System.out.println("Recebendo SMS");
		return "k19 - Treinamentos";
	}

}
