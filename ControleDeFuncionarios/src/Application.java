import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        criarBaseDeDados();
        String encerrarPrograma = "N";

        while (encerrarPrograma != "Y"){
           apresentação();
           String acao = sc.next();
           if (acao.equals("1")) {
               contratarFuncionario();
           } else if (acao.equals("2")) {
               demitirFuncionario();
           } else if (acao.equals("3")) {
               readFuncionario();
           } else if (acao.equals("4")) {
               atualizarDadosFuncionario();
           } else if (acao.equals("Y")) {
               encerrarPrograma = "Y";
           } else {
               System.out.println("Ação inválida!");
           }
           System.out.println();
        }
    }

    public static void criarBaseDeDados(){
        for (int i = 0; i < 100; i++) {
            double salario = random.nextDouble();
            if (salario < 0) {
                salario = salario * -1;
            }
            Application.funcionarios.add(new Funcionario(i, "Nome do Funcionário", salario));
        }
    }

    private static void apresentação(){
        System.out.println(
                "Bem vindo ao controle de funcionários: \n"
                        + "O que você deseja fazer? \n"
                        + "1. Contratar funcionário: \n"
                        + "2. Demitir funcionário. \n"
                        + "3. Ver informações do funcionário. \n"
                        + "4. Atualizar dados do funcionário. \n"
                        + "5. Para encerrar o programa digite 'Y'. \n"
        );
    }

    private static void readFuncionario() {
        int id = Util.scanInt("Digite a matrícula do funcionário que deseja ver os dados: ", "Matrícula inválida");
        Funcionario f = Application.searchFuncionario(id, "Digite a matrícula do funcionário que deseja ver os dados: ");
        f.imprimir();
    }

    private static Funcionario contratarFuncionario() {
        int id = Util.scanInt("Digite a matrícula do funcionário: ", "Matrícula inválida!");
        String name = Util.scanString("Digite o nome do funcionário que deseja contratar: ");
        double salario = Util.scanDouble("Digite o salário do funcionário: ", "Salário inválido");
        Funcionario f = new Funcionario(id, name, salario);
        Application.funcionarios.add(f);
        System.out.println("O funcionário " + f.getName() + " foi contratado com Sucesso.");
        return f;
    }

    private static void demitirFuncionario() {
        int id = Util.scanInt("Digite a matrícula do funcionário que deseja demitir: ", "Matrícula inválida");
        Funcionario f = searchFuncionario(id, "Digite a matrícula do funcionário que deseja demitir: ");
        funcionarios.remove(f);
        System.out.println("O funcionário " + f.getName() + " foi demitido!");
    }

    private static void atualizarDadosFuncionario() {
        int id = Util.scanInt("Digite a matrícula do funcionário que deseja atualizar: ", "Matrícula inválida");
        Funcionario f = searchFuncionario(id, "Digite a matrícula do funcionário que deseja atualizar: ");
        System.out.println("O único dado do funcionário que pode mudar é o salário!");
        double novoSalario = Util.scanDouble("Digite o novo salário do funcionário: ", "Salário inválido");
        f.setSalario(novoSalario);
        f.imprimir();
    }

    private static Funcionario searchFuncionario(int id, String mensagem) {
        Funcionario funcionarioBuscado = null;
        while (funcionarioBuscado == null) {
            for (Funcionario f: Application.funcionarios){
                if(f.getId() == id){
                    funcionarioBuscado = f;
                }
            }
            if (funcionarioBuscado == null){
                System.out.println("Funcionário não encontrado!");
                id = Util.scanInt(mensagem, "Matrícula inválida");
            }
        }
        return funcionarioBuscado;
    }
}
