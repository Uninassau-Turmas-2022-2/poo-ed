public class Cachorro {

    private String nome;
    private static final String NOME_CIENTIFICO = "Canis lupus familiaris";
    private static int contadorDeObjetos = 0;

    public Cachorro(){
        contadorDeObjetos++;
    }

    public static int getContadorDeObjetos(){
        return contadorDeObjetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getNomeCientifico(){
        return NOME_CIENTIFICO;
    }
}
