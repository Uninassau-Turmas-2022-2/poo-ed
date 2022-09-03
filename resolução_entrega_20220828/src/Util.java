import java.util.Scanner;

public class Util {

    public static String scanString(String mensagem){
        String result = null;
        Scanner scan = new Scanner(System.in);
        while (result == null) {
            System.out.print(mensagem);
            result = scan.next();
        }
        return result;
    }

    public static Double scanDouble(String mensagem) {
        Double result = null;
        Scanner scan = new Scanner(System.in);
        while (result == null) {
            System.out.print(mensagem);
            result = scan.nextDouble();
        }
        return result;
    }

    public static Integer scanInt(String mensagem){
        Integer result = null;
        Scanner scan = new Scanner(System.in);
        while (result == null) {
            System.out.print(mensagem);
            result = scan.nextInt();
        }
        return result;
    }

}
