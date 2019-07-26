package exercicio;

public class ComparaNumero {
	private Integer numero1;
	private Integer numero2;

	//Mostre  o  maior  e  o menor (nesta sequência) de números e se são iguais
	public void comparaNumero(Integer numeroUm, Integer numeroDois) {
		setNumero1(numeroUm);
		setNumero2(numeroDois);
		if(getNumero1() > getNumero2()) {
			System.out.println("Os números são diferentes: " + getNumero1()+ " e " + getNumero2());
		} else if (getNumero2() > getNumero1()) {
			System.out.println("Os números são diferentes: " + getNumero2()+ " e " + getNumero1());
		} else {
			System.out.println("Os números "+ getNumero1() +" são iguais.");
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
