package exercicio.listaDeExerciciosJavaBasico;

public class ValorAPagar {
    /*Escrever um algoritmo que lê:
    -a porcentagem do IPI a ser acrescido no valor das peças
    -o   código   da   peça   1,   valor   unitário   da   peça   1,   quantidade   de   peças   1
    -o código da peça 2, valor unitário da peça 2, quantidade de peças 2
    O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
    Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/
    private float porcentagemIPI;
    private Integer codigoPeca1;
    private float valorUnitarioPeca1;
    private Integer quantidadePeca1;
    private Integer codigoPeca2;
    private float valorUnitarioPeca2;
    private Integer quantidadePeca2;
    private float valorTotal;

    public void calculaValorTotal(float porcentagemIPI1,Integer codigoPeca_1,float valorUnitarioPeca_1,Integer quantidadePeca_1,Integer codigoPeca_2,float valorUnitarioPeca_2,Integer quantidadePeca_2) throws Exception {
       try {
           if(porcentagemIPI1<=100 && 0<=porcentagemIPI1) {
               setPorcentagemIPI(porcentagemIPI1);
           } else {
               throw new Exception("A Porcentagem é até 100. ");
           }
           setCodigoPeca1(codigoPeca_1);
           setCodigoPeca2(codigoPeca_2);
           setQuantidadePeca1(quantidadePeca_1);
           setQuantidadePeca2(quantidadePeca_2);
           setValorUnitarioPeca1(valorUnitarioPeca_1);
           setValorUnitarioPeca2(valorUnitarioPeca_2);

           float valorTotal1 = 0;
           valorTotal1 = (getValorUnitarioPeca1()*getQuantidadePeca1() +
                   getValorUnitarioPeca2()*getQuantidadePeca2())*(getPorcentagemIPI()/100 + 1);
           setValorTotal(valorTotal1);

           System.out.println("Valor total a ser pago: " + getValorTotal());
       } catch (Exception e) {
           throw new Exception("Erro ao tentar imprimir valor total -> "+e.getMessage());
       }
    }

    public ValorAPagar() {
        this.porcentagemIPI = 0;
        this.codigoPeca1 = 0;
        this.valorUnitarioPeca1 = 0;
        this.quantidadePeca1 = 0;
        this.codigoPeca2 = 0;
        this.valorUnitarioPeca2 = 0;
        this.quantidadePeca2 = 0;
        this.valorTotal = 0;
    }

    public ValorAPagar(float porcentagemIPI, Integer codigoPeca1, float valorUnitarioPeca1, Integer quantidadePeca1, Integer codigoPeca2, float valorUnitarioPeca2, Integer quantidadePeca2) {
        this.porcentagemIPI = porcentagemIPI;
        this.codigoPeca1 = codigoPeca1;
        this.valorUnitarioPeca1 = valorUnitarioPeca1;
        this.quantidadePeca1 = quantidadePeca1;
        this.codigoPeca2 = codigoPeca2;
        this.valorUnitarioPeca2 = valorUnitarioPeca2;
        this.quantidadePeca2 = quantidadePeca2;
        this.valorTotal = 0;
    }

    public float getPorcentagemIPI() {
        return this.porcentagemIPI;
    }

    public void setPorcentagemIPI(float porcentagemIPI) {
        this.porcentagemIPI = porcentagemIPI;
    }

    public Integer getCodigoPeca1() {
        return this.codigoPeca1;
    }

    public void setCodigoPeca1(Integer codigoPeca1) {
        this.codigoPeca1 = codigoPeca1;
    }

    public float getValorUnitarioPeca1() {
        return this.valorUnitarioPeca1;
    }

    public void setValorUnitarioPeca1(float valorUnitarioPeca1) {
        this.valorUnitarioPeca1 = valorUnitarioPeca1;
    }

    public Integer getQuantidadePeca1() {
        return this.quantidadePeca1;
    }

    public void setQuantidadePeca1(Integer quantidadePeca1) {
        this.quantidadePeca1 = quantidadePeca1;
    }

    public Integer getCodigoPeca2() {
        return this.codigoPeca2;
    }

    public void setCodigoPeca2(Integer codigoPeca2) {
        this.codigoPeca2 = codigoPeca2;
    }

    public float getValorUnitarioPeca2() {
        return this.valorUnitarioPeca2;
    }

    public void setValorUnitarioPeca2(float valorUnitarioPeca2) {
        this.valorUnitarioPeca2 = valorUnitarioPeca2;
    }

    public Integer getQuantidadePeca2() {
        return this.quantidadePeca2;
    }

    public void setQuantidadePeca2(Integer quantidadePeca2) {
        this.quantidadePeca2 = quantidadePeca2;
    }

    public float getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
