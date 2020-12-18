package criacionais.builder;

public class BBBoleto implements Boleto{
	
	private String logo = "BB - Banco do Brasil";
	private String sacado;
	private String cedente;
	private double valor;
	private String vencimento;
	private int nossoNumero;
	
	
	public BBBoleto(String sacado,String cedente, double valor, String vencimento) {
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor; 
		this.vencimento = vencimento;
		this.nossoNumero = Banco.BB.ordinal();
	}
	
	@Override
	public String getSacado() {
		
		return this.sacado;
	}

	@Override
	public String getCedente() {
		
		return this.cedente;
	}

	@Override
	public String getVencimento() {
		return vencimento;
	}
	
	@Override
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setSacado(String sacado) {
		this.sacado = sacado;
	}

	public void setCedente(String cedente) {
		this.cedente = cedente;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setNossoNumero(int nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	@Override
	public double getValor() {
		
		return this.valor;
	}


	@Override
	public int getNossoNumero() {
		
		return this.nossoNumero;
	}

	@Override
	public String getLogo() {
		return this.logo;
	}
	
	
	public String toString() {
		return this.print();
	}

}
