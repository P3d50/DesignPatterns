package builder;

public class BradescoBoletoBuilder implements BoletoBuilder{
	
	private String sacado;
	private String cedente;
	private double valor;
	private String vencimento;
	
	@Override
	public Boleto getBoleto() {
		return new BradescoBoleto(sacado,cedente,valor,vencimento);
	}

	@Override
	public void buildSacado(String sacado) {
		this.sacado=sacado;
		
	}

	@Override
	public void buildCedente(String cedente) {
		this.cedente=cedente;
		
	}

	@Override
	public void buildValor(double valor) {
		this.valor=valor;
		
	}

	@Override
	public void buildVencimento(String vencimento) {
		this.vencimento=vencimento;
		
	}

}
