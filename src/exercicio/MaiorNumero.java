package exercicio;

public class MaiorNumero {
	//Esse m�todo imprime o maior n�mero entre os dois do par�metro
	public void maiorNumero(Integer numero1, Integer numero2) {
		Integer maior = numero2;
		if(numero1 > numero2) maior = numero1;
		System.out.println("O maior n�mero �: " + String.valueOf(maior));		
	}
}
