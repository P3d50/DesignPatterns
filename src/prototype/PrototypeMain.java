package prototype;

import java.util.HashSet;
import java.util.Set;

public class PrototypeMain {

	public static void main(String[] args) {

		String nome = "K19";
		String vencimento =  "25/12/2020";
		
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("Curso");
		hashSet.add("java");
		hashSet.add("K19");
		
		Campanha campanha = new Campanha(nome,vencimento,hashSet);
		System.out.println(campanha);
		Campanha clone = campanha.clone();
		System.out.println(clone);
	}

}
