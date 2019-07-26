package exercicio.listaDeExerciciosJavaBasico;

public class ImprimeNumeros {
    private float mediaAritmetica;
    private float media;
    private float somaMedias;
    private float mediaMedias;

    public ImprimeNumeros() {
        this.mediaAritmetica = 0;
        this.media = 0;
        this.somaMedias = 0;
        this.mediaMedias = 0;
    }

    public ImprimeNumeros(float mediaAritmetica, float media, float somaMedias, float mediaMedias) {
        this.mediaAritmetica = mediaAritmetica;
        this.media = media;
        this.somaMedias = somaMedias;
        this.mediaMedias = mediaMedias;
    }

    /*Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
            A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.*/
    public void imprimeMedia() throws Exception {
        try {
            float mediaAritmetica1 = (8 + 9 + 7)/3;
            setMediaAritmetica(mediaAritmetica1);

            float media1 = (4 + 5 + 6)/3;
            setMedia(media1);

            float somaMedias1 = mediaAritmetica + media;
            setSomaMedias(somaMedias1);

            float mediaMedias = somaMedias/2;
            setMediaMedias(mediaMedias);

            System.out.println("Média aritmética dos números 8,9 e 7: " + getMediaAritmetica());
            System.out.println("A média dos números 4, 5 e 6: " + getMedia());
            System.out.println("A soma das duas médias: " + getSomaMedias());
            System.out.println("A média das médias: " + getMediaMedias());

        } catch (Exception e) {
            throw new Exception("Erro ao tentar imprimir números e médias -> "+e.getMessage());
        }
    }

    public float getMediaAritmetica() {
        return this.mediaAritmetica;
    }

    public void setMediaAritmetica(float mediaAritmetica) {
        this.mediaAritmetica = mediaAritmetica;
    }

    public float getMedia() {
        return this.media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getSomaMedias() {
        return this.somaMedias;
    }

    public void setSomaMedias(float somaMedias) {
        this.somaMedias = somaMedias;
    }

    public float getMediaMedias() {
        return this.mediaMedias;
    }

    public void setMediaMedias(float mediaMedias) {
        this.mediaMedias = mediaMedias;
    }
}
