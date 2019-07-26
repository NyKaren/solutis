package exercicio;

public class mainNum {
	public static void main(String[] args) {
		try {
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

			Agenda agenda = new Agenda();
			Contato contato1 = new Contato();
			contato1.setNome("Samanta");
			contato1.setEmail("teste@teste,com.br");
			agenda.adicionaContato(contato1);
			agenda.buscaContato("Samanta");
			agenda.excluiContato("Samanta");
			//agenda.buscaContato("Samanta");

			MediaAluno mediaAluno = new MediaAluno();
			mediaAluno.adiciona(1);
			mediaAluno.adiciona(12);
			mediaAluno.calculaMedia();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
