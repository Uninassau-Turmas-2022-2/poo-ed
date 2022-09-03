public class Exercicio9 {
    public static void main(String[] args) {
        String name = Util.scanString(
                "Digite seu nome: "
        );
        Double salary = Util.scanDouble(
                "Digite o seu salário: "
        );
        Double vendasEfetuadas = Util.scanDouble(
                "Digite o valor total de suas vendas: "
        );

        System.out.println("TOTAL = R$ " + (salary + 0.15 * vendasEfetuadas));
    }
}
