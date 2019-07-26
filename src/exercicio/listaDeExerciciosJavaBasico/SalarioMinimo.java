package exercicio.listaDeExerciciosJavaBasico;

public class SalarioMinimo {
    /*Crie um algoritmo que leia o valor do salário mínimo eo valor do salário de um usuário,
    calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
    (1SM=R$788,00)*/

    private float salarioMinimo;
    private float salarioUsuario;
    private float quantidadeSalarioUsuario;

    public void quantoSMUsuario (float salarioUsuario1) throws Exception {
        try {
            float qtd = 0;
            setSalarioUsuario(salarioUsuario1);
            qtd = getSalarioUsuario()/getSalarioMinimo();
            setQuantidadeSalarioUsuario(qtd);

            System.out.println("Quantidade de Salário Mínimo que o usuário recebe: " + getQuantidadeSalarioUsuario());
        } catch (Exception e) {
            throw new Exception("Erro ao tentar imprimir quantidade de Salário Mínimo que o usuário recebe -> "+e.getMessage());
        }
    }

    public SalarioMinimo() {
        this.salarioMinimo = (float)788.00;
        this.salarioUsuario = 0;
        this.quantidadeSalarioUsuario = 0;
    }

    public SalarioMinimo(float salarioMinimo, float salarioUsuario) {
        this.salarioMinimo = (float) 788.00;
        this.salarioUsuario = salarioUsuario;
        this.quantidadeSalarioUsuario = 0;
    }

    public float getSalarioMinimo() {
        return this.salarioMinimo;
    }

    public void setSalarioMinimo(float salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public float getSalarioUsuario() {
        return this.salarioUsuario;
    }

    public void setSalarioUsuario(float salarioUsuario) {
        this.salarioUsuario = salarioUsuario;
    }

    public float getQuantidadeSalarioUsuario() {
        return this.quantidadeSalarioUsuario;
    }

    public void setQuantidadeSalarioUsuario(float quantidadeSalarioUsuario) {
        this.quantidadeSalarioUsuario = quantidadeSalarioUsuario;
    }
}
