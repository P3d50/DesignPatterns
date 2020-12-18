package builder;

public interface Boleto {
	
	
	String getSacado();
	void setSacado(String sacado);
	String getCedente();
	void setCedente(String cedente);
	double getValor();
	void setValor(double valor);
	String getVencimento();
	void setVencimento(String vencimento);
	int getNossoNumero();
	String getLogo();
	
	
	default String print() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n****************************************\n");
		sb.append(this.getLogo()+"\n");
		sb.append("Cedente: "+this.getCedente()+"\n");
		sb.append("Nosso número: "+this.getNossoNumero()+"\n");
		sb.append("Sacado: "+this.getSacado()+"\n");
		sb.append("Valor : R$ "+this.getValor()+"\n");
		sb.append("Vencimento: "+this.getVencimento()+"\n");
		return sb.toString();
	}

}
