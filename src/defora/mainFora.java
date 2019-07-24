package defora;
import interfaceManda.GatoViraLatas;
import interfaceManda.Labrador;
import solutis12.MandaChuva;

public class mainFora {
	public static void main(String[] args) {
		GatoViraLatas mingau = new MandaChuva();
		mingau.quantidadeLatasViradas(40);
		System.out.println("Latas: " + String.valueOf(mingau.getQtdLatasViradas()));
		mingau.setQtdLatasViradas(40);
		System.out.println(String.valueOf(mingau.getQtdLatasViradas()));
		
		GatoViraLatas pepita =  new Labrador();
		pepita.quantidadeLatasViradas(30);
		System.out.println(String.valueOf(pepita.getQtdLatasViradas()));
	}
}
