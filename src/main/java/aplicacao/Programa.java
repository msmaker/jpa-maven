package aplicacao;

import entity.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Marco", "marco@gmail.com");
		Pessoa p2 = new Pessoa(1, "Dayana", "Daya@gmail.com");
		Pessoa p3 = new Pessoa(1, "Alexandre", "aLe@gmail.com");
		Pessoa p4 = new Pessoa(1, "Aline", "aline@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
