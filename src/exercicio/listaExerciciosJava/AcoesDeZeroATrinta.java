package exercicio.listaExerciciosJava;

public class AcoesDeZeroATrinta {
	private int soma = 0;
	private int multiplicacao = 0;

	 // imprime na tela a soma dos n�meros �mpares entre 0 e 30 
	public void somaImpares() {
		int total = 0;
		for(int i = 1; i<31; i++) {
			if(i%2 !=0) {
				total+= i;
			}
		}
		setSoma(total);
		System.out.println("A soma dos n�meros �mpares entre 0 e 30 gera: " + getSoma());
	}
	
	  //imprime na tela a multiplica��o dos n�meros pares entre 0 e 30
	public void multiplicaPares() {
		int total = 0;
		for(int i = 1; i<31; i++) {
			if(i%2 ==0) {
				total*= i;
			}
		}
		setMultiplicacao(total);
		System.out.println("A multiplica��o dos n�meros pares entre 0 e 30 gera: " + getMultiplicacao());
	}

	public int getSoma() {
		return this.soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}

	public int getMultiplicacao() {
		return this.multiplicacao;
	}

	public void setMultiplicacao(int multiplicacao) {
		this.multiplicacao = multiplicacao;
	}
}
