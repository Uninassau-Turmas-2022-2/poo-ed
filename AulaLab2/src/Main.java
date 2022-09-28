public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.setNome("Rex");
        System.out.println(Cachorro.getNomeCientifico() +
                ": " + c1.getNome() + " - Objeto: " + Cachorro.getContadorDeObjetos());

        Cachorro c2 = new Cachorro();
        c2.setNome("Totó");
        System.out.println(Cachorro.getNomeCientifico() +
                ": " + c2.getNome() + " - Objeto: " + Cachorro.getContadorDeObjetos());
    }
}
