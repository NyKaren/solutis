package exercicio;

public class NumeroDecrescente {
	//Esse m�todo imprime do n�mero do par�metro at� 0, decrescentemente
	public void numeroDecrescente(Integer numero) {
		int i = numero;
		do {
			System.out.println(i);
			i-=1;
		} while(i>=0);		
	}
}
