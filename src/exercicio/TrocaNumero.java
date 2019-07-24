package exercicio;

public class TrocaNumero {
	
	// Imprime os números de entrada em ordem inversa
	public void trocaNumero (Integer NumA, Integer NumB) {
		Integer c = NumA;
		NumA = NumB;
		NumB = c;
		System.out.println(String.valueOf(NumA) + " e " + String.valueOf(NumB) );
	}
}
