package criacionais.builder;

public class BradescoBoleto implements Boleto{

	private String logo = "Bradesco - Dia e Noite";
	private String sacado;
	private String cedente;
	private double valor;
	private String vencimento;
	private int nossoNumero;
	
	public BradescoBoleto(String sacado,String cedente, double valor, String vencimento) {
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor; 
		this.vencimento = vencimento;
		this.nossoNumero = Banco.Bradesco.ordinal();
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
	public double getValor() {
		
		return this.valor;
	}

	@Override
	public String getVencimento() {
		
		return this.vencimento;
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

	@Override
	public void setSacado(String sacado) {
		this.sacado = sacado;
		
	}

	@Override
	public void setCedente(String cedente) {
		this.cedente = cedente;
		
	}

	@Override
	public void setValor(double valor) {
		this.valor=valor;
		
	}

	@Override
	public void setVencimento(String vencimento) {
		this.vencimento=vencimento;
		
	}

}
