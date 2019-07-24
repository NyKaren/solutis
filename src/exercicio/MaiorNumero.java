package exercicio;

public class MaiorNumero {
	//Esse método imprime o maior número entre os dois do parâmetro
	public void maiorNumero(Integer numero1, Integer numero2) {
		Integer maior = numero2;
		if(numero1 > numero2) maior = numero1;
		System.out.println("O maior número é: " + String.valueOf(maior));		
	}
}
