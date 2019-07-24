package solutis12;

import defora.Batatinha;
import defora.Garfield;
import interfaceManda.GatoViraLatas2;

public class Rodar {
	public static void main(String[] args) {
		Cat gato = new Cat();
		System.out.println("fjdsfhjdsh");
		gato.setNome("Mingau");
		gato.setPeso(5);
		System.out.println(gato.getNome() + " tem " + gato.getPeso() + " quilos.");
		System.out.println(gato.falar("Miaaaaaaaaaaaaaau"));
		System.out.println(gato.falar("Morra humano ", 5));
		
		//Munchkin anao = new GatoViraLatas2(); É tipo Munchkin
		//anao. não aparece revirarLata
		
		Garfield gatinho = new Garfield();
		gatinho.falar("ebaaaaaaaaaa"); //herda o método
		gatinho.comer();//herda o método protected
		//gatinho.doContra(); não herda o método private

		Batatinha batatinha = new Batatinha();
		batatinha.setNome("Vivante"); //batatinha não tem set override
		gatinho.setNome("Vivante2");
		System.out.println(batatinha.getNome()); //pega o valor do atributo de batatinha que está vazio
		System.out.println(gatinho.getNome());
		
		//Cat.temRabo; Eclipse não permite, mas o Intelij sim. FUNCIONA!
		gatinho.TEM_RABO = false;
		System.out.println(String.valueOf(gatinho.TEM_RABO));
	}
}
