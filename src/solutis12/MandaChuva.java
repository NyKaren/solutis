package solutis12;

import interfaceManda.GatoViraLatas;

public class MandaChuva implements GatoViraLatas{
	private Integer qtdLatasViradas;
	
	@Override
	public void quantidadeLatasViradas(Integer latas) {
		this.qtdLatasViradas = latas;
	}

	@Override
	public Integer getQtdLatasViradas() {
		return this.qtdLatasViradas;
	}
	@Override
	public void setQtdLatasViradas(Integer q) {
		this.qtdLatasViradas = q;
	}	
	
	public void manda() {
		System.out.println("Entrei");
	}
}
