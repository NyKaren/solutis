package exercicio.listaExerciciosJava;

public class MaiorNumero {
	private Integer numero1;
	private Integer numero2;

	//Esse método imprime o maior número entre os dois do parâmetro
	public void maiorNumero(Integer numeroA, Integer numeroB) {
		setNumero1(numeroA);
		setNumero2(numeroB);
		Integer maior = getNumero2();
		if(getNumero1() > getNumero2()) maior = getNumero1();
		System.out.println("O maior número é: " + maior);
	}

	public Integer getNumero1() {
		return this.numero1;
	}

	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return this.numero2;
	}

	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}
}
