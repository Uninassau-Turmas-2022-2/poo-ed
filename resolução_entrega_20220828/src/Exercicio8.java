public class Exercicio8 {

    public static void main(String[] args) {
        Integer numeroFuncionario =
                Util.scanInt("Digite o número do funcionário: ");
        Integer horasTrabalhadas =
                Util.scanInt("Digite a quantidade de horas trabalhadas: ");
        Double valorHora =
                Util.scanDouble("Digite o valor da hora: ");

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = " + horasTrabalhadas * valorHora);

    }

}
