import java.util.ArrayList;
import java.util.Random;

public class Exercicio1 {

    public static void main(String[] args) {
        Random gerador = new Random();
        ArrayList<String> cartas = new ArrayList<String>(); //representação de um deck de cartas

        for (int i = 0; i < 1000; i++) {
            Integer random = gerador.nextInt();
            if (random > 0){
                cartas.add("VERMELHO");
            } else {
                cartas.add("AZUL");
            }
        }

        Integer cartasVermelhas = 0;
        Integer cartasAzuis = 0;

        for (String carta: cartas) {
            if (carta == "VERMELHO") {
                cartasVermelhas++;
            } else {
                cartasAzuis++;
            }
        }

        System.out.println("A quantidade de cartas vermelhas é: " + cartasVermelhas);
        System.out.println("A quantidade de cartas azuis é: " + cartasAzuis);



    }

}
