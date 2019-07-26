package exercicio;

public class ComparaNumero {
	private Integer numero1;
	private Integer numero2;

	//Mostre  o  maior  e  o menor (nesta sequ�ncia) de n�meros e se s�o iguais
	public void comparaNumero(Integer numeroUm, Integer numeroDois) {
		setNumero1(numeroUm);
		setNumero2(numeroDois);
		if(getNumero1() > getNumero2()) {
			System.out.println("Os n�meros s�o diferentes: " + getNumero1()+ " e " + getNumero2());
		} else if (getNumero2() > getNumero1()) {
			System.out.println("Os n�meros s�o diferentes: " + getNumero2()+ " e " + getNumero1());
		} else {
			System.out.println("Os n�meros "+ getNumero1() +" s�o iguais.");
		}
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
