package interfaceManda;

public class Labrador implements GatoViraLatas {
	private Integer qtdLatasViradas;

	@Override
	public void quantidadeLatasViradas(Integer latas) {
		this.qtdLatasViradas = 2 * latas;		
	}

	@Override
	public Integer getQtdLatasViradas() {
		return this.qtdLatasViradas;
	}

	@Override
	public void setQtdLatasViradas(Integer q) {
		this.qtdLatasViradas = q;		
	}

}
