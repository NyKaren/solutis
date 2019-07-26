package exercicio.listaDeExerciciosJavaBasico;

public class Saldo {
    public float saldo;
    public float saldoComReajuste;

    public Saldo() {
        this.saldo = 0;
        this.saldoComReajuste = 0;
    }

    public Saldo(float saldo) {
        this.saldo = saldo;
        this.saldoComReajuste = 0;
    }

    /*Informar um saldo e imprimir o saldo com reajuste de 1%.*/
    public void reajuste(float saldo1) throws Exception {
        try {
            setSaldo(saldo1);
            float reajustado = 0;
            reajustado = (float) (getSaldo() + (getSaldo()*0.01));
            setSaldoComReajuste(reajustado);

            System.out.println(getSaldoComReajuste());
        } catch (Exception e) {
            throw new Exception("Erro ao tentar reajustar o saldo -> "+e.getMessage());
        }
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoComReajuste() {
        return this.saldoComReajuste;
    }

    public void setSaldoComReajuste(float saldoComReajuste) {
        this.saldoComReajuste = saldoComReajuste;
    }
}
