package criacionais.singleton;


import java.util.HashMap;
import java.util.Map;

public class Configuracao {
	
	
	private Map<String,String> propriedades;
	private static Configuracao instance;
	
	public Configuracao() {
		this.propriedades = new HashMap<String,String>();
		this.propriedades.put("time-zone","America/Sao_Paulo");
		this.propriedades.put("currency-code","BRL");
	}
	
	public String getPropriedades(String propriedade) {
		return this.propriedades.get(propriedade);
	}

	public void setPropriedades(Map<String,String> propriedades) {
		this.propriedades = propriedades;
	}

	public static Configuracao getInstance() {
		if(Configuracao.instance==null) {
			Configuracao.instance = new Configuracao();
		}
		return Configuracao.instance;
	}

	

}
