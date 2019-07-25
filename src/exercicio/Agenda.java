package exercicio;
import exercicio.Contato;

import java.util.List;
import java.util.Vector;

public class Agenda {
    private Contato[] contatos;
    private int totalDeContatos = 0;

    public Agenda(){
        contatos = new Contato[1];
    }

    public void adicionaContato(Contato contato) throws Exception {
        //adiciona novo contato em posição vazia do vetor
        try {
            Contato[] novaArray = new Contato[this.contatos.length * 2];
            for (int i = 0; i < this.contatos.length; i++) {
                novaArray[i] = this.contatos[i];
            }
            this.contatos = novaArray;
            getContatos()[this.totalDeContatos] = contato;
            this.totalDeContatos++;
            System.out.println("Contato adicionado com sucesso. ");
        } catch (Exception e) {
            throw new Exception("Erro ao tentar adicionar um contato -> "+e.getMessage());
        }
    }

    public Contato buscaContato(String nome) throws Exception {
        //busca contato retorna uma instância de Contato
        try{
            for(Contato contato  : getContatos()){
                if(contato.getNome().equalsIgnoreCase(nome)){
                    System.out.println("Contato encontrado: "+contato.toString());
                    return contato;
                }
            }
            throw new Exception("Contato não encontrado. ");
        } catch (Exception e) {
            throw new Exception("Erro ao buscar contato -> "+e.getMessage());
        }
    }

    public void excluiContato(String nome) throws Exception {
        //exclui contato através do nome
        try {
            Contato excluido = buscaContato(nome);
            excluido.setNome(null);
            excluido.setEmail(null);
            System.out.println("Contato excluído com sucesso. ");
        } catch (Exception e) {
            throw new Exception("Erro ao excluir contato -> "+e.getMessage());
        }
    }

    public Contato[] getContatos() {
        return this.contatos; //coloquei .this
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
}
