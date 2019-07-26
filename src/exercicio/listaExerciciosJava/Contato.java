package exercicio.listaExerciciosJava;

import java.util.Objects;

public class Contato {
    private String nome;
    private String email;

    public Contato(String nome, String email) {
        super();
        this.nome = nome;
        this.email = email;
    }

    public Contato() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return getNome().equals(contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n\nNome: ").append(getNome()).append("\nEmail: ").append(getEmail());
        return  buffer.toString();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
