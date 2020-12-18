package criacionais.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		Configuracao configuracao = Configuracao.getInstance();
		System.out.println(configuracao.getPropriedades("time-zone"));
		System.out.println(configuracao.getPropriedades("currency-code"));

	}

}
