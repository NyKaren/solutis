package exercicio;

public class ComparaNumero {
	//Mostre  o  maior  e  o menor (nesta sequência) de números e se são iguais
	public void comparaNumero(Integer numero1, Integer numero2) {
		if(numero1 > numero2) {
			System.out.println("Os números são diferentes: " + String.valueOf(numero1)+ " e " + String.valueOf(numero2));
		} else if (numero2 > numero1) {
			System.out.println("Os números são diferentes: " + String.valueOf(numero2)+ " e " + String.valueOf(numero1));
		} else {
			System.out.println("Os números "+ String.valueOf(numero1) +" são iguais.");
		}
	}
}
