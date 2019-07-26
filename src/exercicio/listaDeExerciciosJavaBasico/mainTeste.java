package exercicio.listaDeExerciciosJavaBasico;

public class mainTeste {
    public static void main(String[] args) {
        try {
            Calculo num = new Calculo();
            num.transformaIdadeEmDias(28, 2, 10);

            ImprimeNumeros imprime = new ImprimeNumeros();
            imprime.imprimeMedia();

            Saldo saldo = new Saldo();
            saldo.reajuste(100);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
