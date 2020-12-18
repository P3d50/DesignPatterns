package criacionais.builder;

public interface BoletoBuilder {

	void buildSacado(String sacado) ;
		
	void buildCedente(String cedente);
		
	void buildValor(double valor) ;

	void buildVencimento(String vencimento) ;
	
	
	Boleto  getBoleto();
}
