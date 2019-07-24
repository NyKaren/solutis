package exercicio;

public class NumeroDecrescente {
	//Esse método imprime do número do parâmetro até 0, decrescentemente
	public void numeroDecrescente(Integer numero) {
		int i = numero;
		do {
			System.out.println(i);
			i-=1;
		} while(i>=0);		
	}
}
