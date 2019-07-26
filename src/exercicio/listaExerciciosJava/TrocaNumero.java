package exercicio.listaExerciciosJava;

public class TrocaNumero {
	private Integer NumA;
	private Integer NumB;

	// Imprime os números de entrada em ordem inversa
	public void trocaNumero (Integer numero1, Integer numero2) {
		setNumA(numero1);
		setNumB(numero2);
		Integer c = getNumA();
		setNumA(getNumB());
		setNumB(c);
		System.out.println(getNumA() + " e " + getNumB() );
	}

	public Integer getNumA() {
		return this.NumA;
	}

	public void setNumA(Integer numA) {
		this.NumA = numA;
	}

	public Integer getNumB() {
		return this.NumB;
	}

	public void setNumB(Integer numB) {
		this.NumB = numB;
	}
}
