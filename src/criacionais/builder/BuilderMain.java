package criacionais.builder;

public class BuilderMain {

	public static void main(String[] args) {
		GeradorDeBoleto bbGeradorDeBoleto = new GeradorDeBoleto(new BBBoletoBuilder());
		Boleto bbBoleto1 = bbGeradorDeBoleto.geraBoleto("Pedro Marcos Ramos", "Andrea Sales Ramos", 50000, "25/12/2020");
		System.out.println(bbBoleto1.toString());
		
		Boleto bbBoleto2 = bbGeradorDeBoleto.geraBoleto("IT World", "Pedro Marcos Ramos", 1000000000, "25/12/2020");
		System.out.println(bbBoleto2.toString());
		
		
		GeradorDeBoleto bradescoGeradorDeBoleto = new GeradorDeBoleto(new BradescoBoletoBuilder());
		Boleto bradescoBoleto1 = bradescoGeradorDeBoleto.geraBoleto("P3d50 IT Services", "IT World", 50000, "25/12/2020");
		System.out.println(bradescoBoleto1.toString());
		
		Boleto bradescoBoleto2 = bradescoGeradorDeBoleto.geraBoleto("IT World", "Pedro Marcos Ramos", 1000000000, "25/12/2020");
		System.out.println(bradescoBoleto2.toString());
		
		

	}

}
