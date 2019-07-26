package exercicio.listaDeExerciciosJavaBasico;

public class Calculo {
    public Integer anoIdade;
    public Integer mesIdade;
    public Integer diaIdade;
    public Integer totalIdadeDias;

    public Calculo() {
        this.anoIdade = 0;
        this.mesIdade = 0;
        this.diaIdade = 0;
        this.totalIdadeDias = 0;
    }

    public Calculo(Integer anoIdade, Integer mesIdade, Integer diaIdade, Integer totalIdadeDias) {
        this.anoIdade = anoIdade;
        this.mesIdade = mesIdade;
        this.diaIdade = diaIdade;
        this.totalIdadeDias = totalIdadeDias;
    }

    /*Faça  um  algoritmo que  leia  a  idade  de  uma pessoa  expressa  em anos,  meses  e dias
            e mostre-a expressa em dias.
            Leve em consideração o ano com 365 dias e o mês com 30.
            (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/
    public void transformaIdadeEmDias(Integer anos, Integer meses, Integer dias) throws Exception {
        try {
            setAnoIdade(anos);
            setMesIdade(meses);
            setDiaIdade(dias);
            Integer transformando = 0;
            transformando = getAnoIdade() * 365 + getMesIdade() * 30 + getDiaIdade();
            setTotalIdadeDias(transformando);
            System.out.println(getAnoIdade()+ " anos, " + getMesIdade() + " meses e " + getDiaIdade() +
                    " dias = "+ getTotalIdadeDias() + " dias.");
        } catch (Exception e) {
            throw new Exception("Erro ao tentar transformar idade -> "+e.getMessage());
        }
    }

    public Integer getAnoIdade() {
        return this.anoIdade;
    }

    public void setAnoIdade(Integer anoIdade) {
        this.anoIdade = anoIdade;
    }

    public Integer getMesIdade() {
        return this.mesIdade;
    }

    public void setMesIdade(Integer mesIdade) {
        this.mesIdade = mesIdade;
    }

    public Integer getDiaIdade() {
        return this.diaIdade;
    }

    public void setDiaIdade(Integer diaIdade) {
        this.diaIdade = diaIdade;
    }

    public Integer getTotalIdadeDias() {
        return this.totalIdadeDias;
    }

    public void setTotalIdadeDias(Integer totalIdadeDias) {
        this.totalIdadeDias = totalIdadeDias;
    }
}
