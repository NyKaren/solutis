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

            ValorAPagar valorAPagar = new ValorAPagar();
            valorAPagar.calculaValorTotal(1,2,3,4,
                    5,6,7);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
