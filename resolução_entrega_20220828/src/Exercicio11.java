public class Exercicio11 {

    public static void main(String[] args) {
        Integer raio = Util.scanInt("Digite o raio da esfera: ");
        System.out.printf("VOLUME = %.3f", ((4.0/3.0) * Math.PI * Math.pow(raio, 3) ));
    }

}
