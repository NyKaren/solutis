package exercicio;

public class AcoesDeZeroATrinta {
	 // imprime na tela a soma dos n�meros �mpares entre 0 e 30 
	public void somaImpares() {
		int soma = 0;
		for(int i = 1; i<31; i++) {
			if(i%2 !=0) {
				soma+= i;				
			}
		}
		System.out.println("A soma dos n�meros �mpares entre 0 e 30 gera: " + String.valueOf(soma));
	}
	
	  //imprime na tela a multiplica��o dos n�meros pares entre 0 e 30
	public void multiplicaPares() {
		int multiplicacao = 0;
		for(int i = 1; i<31; i++) {
			if(i%2 ==0) {
				multiplicacao*= i;				
			}
		}
		System.out.println("A multiplica��o dos n�meros pares entre 0 e 30 gera: " + String.valueOf(multiplicacao));		
	}
}
