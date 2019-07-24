package solutis12;

public class Cat {
	private String nome;
	private String corDoPelo;
	private int peso;
	public static Boolean TEM_RABO = true;
	//public final Boolean TEM_RABO = true; --É imutável
	
	
	public String falar(String fala) {
		return fala;
	}
	public String falar(String fala, Integer quantidade) {
		return fala + String.valueOf(quantidade) + " vezes mais rápido.";
	}
	
	protected void comer() {
		
	}
	
	private void doContra() {
		
	}	
	
	public String getCorDoPelo() {
		return this.corDoPelo;
	}
	public void setCorDoPelo(String c) {
		this.corDoPelo = c;
	}
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int p) {
		this.peso = p;
	}
	public String getNome() {
		return this.nome;
	}	
	public void setNome(String a) {
		this.nome = a;
	}
}
