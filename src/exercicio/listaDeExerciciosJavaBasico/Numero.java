package exercicio.listaDeExerciciosJavaBasico;

public class Numero {
    /*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor*/
    private Integer numero;
    private Integer antecessor;
    private Integer sucessor;

    public void imprimeNumero( Integer numero1) throws Exception {
        try {
            setNumero(numero1);
            setAntecessor(getNumero() -1);
            setSucessor(getNumero() +1);

            System.out.println("Antecessor: " + getAntecessor() + "; Sucessor: " + getSucessor());
        } catch (Exception e) {
            throw new Exception("Erro ao tentar imprimir antecessor e sucessor de número -> "+e.getMessage());
        }
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAntecessor() {
        return this.antecessor;
    }

    public void setAntecessor(Integer antecessor) {
        this.antecessor = antecessor;
    }

    public Integer getSucessor() {
        return this.sucessor;
    }

    public void setSucessor(Integer sucessor) {
        this.sucessor = sucessor;
    }
}
