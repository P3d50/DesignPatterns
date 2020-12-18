package criacionais.builder;

public class GeradorDeBoleto {

	
	private BoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto geraBoleto(String sacado,String cedente,double valor,String vencimento) {
		this.boletoBuilder.buildSacado(sacado);
		this.boletoBuilder.buildCedente(cedente);
		this.boletoBuilder.buildValor(valor);
		this.boletoBuilder.buildVencimento(vencimento);
		return this.boletoBuilder.getBoleto();
	}
	
}
