package exercicio.listaExerciciosJava;

public class NumeroDecrescente {
	private Integer numero;

	//Esse m�todo imprime do n�mero do par�metro at� 0, decrescentemente
	public void numeroDecrescente(Integer numero1) {
		setNumero(numero1);
		Integer i = getNumero();
		do {
			System.out.println(getNumero());
			i-=1;
			setNumero(i);
		} while(i>=0);		
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
