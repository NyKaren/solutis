package interfaceManda;

import solutis12.Cat;
import solutis12.MandaChuva;

public class EakTheCat {
	public static String getNome1(Cat gato) {
		return gato.getNome();
	}

	public static String getNome2(Cat gato) {
		// No eclipse não funciona, mas no Intelij funciona.
		/*
		 * if(gato instanceof MandaChuva) { MandaChuva chuva = (MandaChuva) gato;
		 * chuva.manda(); }
		 */
		return gato.getNome();
	}

	//todas extendem de object
	public static String getNome(Object gato) {
		// No eclipse não funciona, mas no Intelij funciona.
		if(gato instanceof MandaChuva) { 
			MandaChuva chuva = (MandaChuva) gato;
			chuva.manda(); 
			//chuva.getNome(); imprime nada no Intelij
		}
		return "";
	}
}
