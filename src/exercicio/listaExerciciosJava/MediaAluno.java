package exercicio.listaExerciciosJava;

import java.util.Arrays;

public class MediaAluno {
	/*
	 * Crie  uma  classe  MediaAluno  que  contenha um  atributo  do  tipo  vetor  de inteiros com  o nome de notas.
	 * Essa classe deve ter um método para adicionar as  notas  nesse  vetor
	 * (os  valores  que  podem  ser  adicionados  no  vetor  são  os inteiros  entre  0  e  100,
	 * caso  contrário  imprime  uma  mensagem  de  erro  e  não adiciona)
	 * e  outro método  que  calcule  a  média  de  um  aluno  e  imprima  essa média.
	*/

	private int[] notas;
	private int totalDeNotas = 0;

	public MediaAluno() {
		notas = new int[1];
	}

	public void adiciona(Integer nota) throws Exception {
		try {
			if (nota >=0 && 100 >= nota) {
				int[] notasAluno = new int[this.notas.length + 1];
				for (int i = 0; i < this.notas.length; i++) {
					notasAluno[i] = this.notas[i];
				}
				this.notas = notasAluno;
				getNotas()[this.totalDeNotas] = nota;
				this.totalDeNotas++;
				System.out.println("Nota adicionada com sucesso");
			} else {
				System.out.println("Nota fora do padrão. Favor adicionar número inteiro de 0 a 100");
			}
		} catch (Exception e) {
			throw new Exception("Erro ao tentar adicionar uma nota de aluno -> "+e.getMessage());
		}
	}

	public void calculaMedia() throws Exception {
		try {
			float media = (float) 0.0;
			int somaNotasDeAluno = 0;

			for (int i = 0; i < this.notas.length; i++) {
				somaNotasDeAluno += this.notas[i];
			}
			media = (float)somaNotasDeAluno/(float)totalDeNotas;
			System.out.println("A média das notas do aluno é " + media);
		} catch (Exception e) {
			throw new Exception("Erro ao tentar calcular a média das notas do aluno -> "+e.getMessage());
		}
	}

	public int[] getNotas() {
		return this.notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public int getTotalDeNotas() {
		return this.totalDeNotas;
	}

	public void setTotalDeNotas(int totalDeNotas) {
		this.totalDeNotas = totalDeNotas;
	}
}
