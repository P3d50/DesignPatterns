package prototype;

import java.util.Set;

public class Campanha implements Prototype<Campanha>{

	private String nome;
	private String vencimento;
	private Set<String> palavrasChave;
	
	
	public Campanha(String nome,String vencimento,Set<String> palavrasChave) {
		this.nome=nome;
		this.vencimento=vencimento;
		this.palavrasChave=palavrasChave;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public Set<String> getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(Set<String> palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	public Campanha clone() {
		String novaCampanhaNome = "Cópia da Campanha - "+this.getNome();
		String novaCampanhaVencimento = this.vencimento;
		Set<String> novaCampannhaPalavrasChave = this.palavrasChave;
		Campanha novaCampanha = new Campanha(novaCampanhaNome,novaCampanhaVencimento,novaCampannhaPalavrasChave);
		return novaCampanha;
		
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("----------------------------\n");
		buffer.append("Campanha: "+this.nome+"\n");
		buffer.append("Vencimento:"+this.vencimento+"\n");
		buffer.append("Palavras chave: \n");
		buffer.append("[");
		palavrasChave.forEach(a->buffer.append("-"+a));
		buffer.append("]");
		return buffer.toString();
	}
}
