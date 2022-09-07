public class Exercicio2 {

    public static void main(String[] args) {
        Double nota1 = Util.scanDouble("Digite a sua primeira nota: ");
        Double nota2 = Util.scanDouble("Digite a sua segunda nota: ");
        Double presenca = Util.scanDouble("Digite o percentual de presenca do aluno sem %: ");

        Double resultado = (nota1 + nota2) / 2;

        if (presenca < 85) {
            System.out.println("O aluno foi reprovado por falta pois a presença foi de: " + presenca + "%");
        } else {
            if (resultado >= 7.0) {
                System.out.println("O aluno foi aprovado com nota: " + resultado);
            } else if (resultado >= 3) {
                Double notaFinal = Util.scanDouble("Digite a sua da prova final: ");
                if ((notaFinal + resultado) / 2.0 >= 5.0) {
                    System.out.println("O aluno foi aprovado com nota: " + resultado);
                } else {
                    System.out.println("O aluno foi reprovado com nota: " + resultado);
                }
            } else {
                System.out.println("O aluno foi reprovado com nota: " + resultado);

            }
        }

    }
}
