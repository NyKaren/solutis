package exercicio;

public class mainNum {
	public static void main(String[] args) {
		MaiorNumero num = new MaiorNumero();
		NumeroDecrescente num2 = new NumeroDecrescente();
		num.maiorNumero(5,4);
		num2.numeroDecrescente(4);
		AcoesDeZeroATrinta acoes = new AcoesDeZeroATrinta();
		acoes.somaImpares();
		acoes.multiplicaPares();
		TrocaNumero trocaNumero = new TrocaNumero();
		trocaNumero.trocaNumero(4, 5);
		ComparaNumero comparaNumero = new ComparaNumero();
		comparaNumero.comparaNumero(5, 3);
	}
}
