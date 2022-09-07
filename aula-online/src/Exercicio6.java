import java.util.ArrayList;

public class Exercicio6 {

    public static void main(String[] args) {

        ArrayList<String> cartas = new ArrayList<String>();

        cartas.add(Integer.toString(1));
        cartas.add(Integer.toString(2));
        cartas.add(Integer.toString(3));
        cartas.add(Integer.toString(6));
        cartas.add(Integer.toString(10));
        cartas.add(Integer.toString(4));
        cartas.add(Integer.toString(7));
        cartas.add(Integer.toString(8));
        cartas.add(Integer.toString(9));
        cartas.add(Integer.toString(5));
        cartas.add(Integer.toString(11));
        cartas.add(Integer.toString(12));
        cartas.add(Integer.toString(13));


        for (int i = 0; i < 5; i++) {
            System.out.println("O número da carta é :" + cartas.get(i));
        }

        int index = 5;
        while (index < 13) {
            System.out.println("O número da carta é :" + cartas.get(index));
            index++;
        }

    }
}
