import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        List<Funcionario> funcionariosLista = new ArrayList<>();

        Random random = new Random();

        int contador = 0;

        while(contador <10){
            System.out.println(contador);


            contador++;
        }

        for (int matricula = 0; matricula < 100; matricula++) {


            Funcionario f = new Funcionario("Daivid - " + matricula, matricula);
            funcionariosLista.add(f);

        }
        Funcionario funcionario = new Funcionario("Daivid - " + 12345, 12345);
        funcionariosLista.add(funcionario);

        Funcionario[] funcionariosArray = new Funcionario[5];
        for (int matricula = 0; matricula < 5; matricula++) {
            Funcionario f = new Funcionario("João - " + matricula, random.nextInt());
            funcionariosArray[matricula] = f;
        }

        System.out.println(funcionariosArray[4].getNome() + " * " + funcionariosArray[4].getNumeroMatricula());

        funcionariosArray[4] = new Funcionario("João - 4", 12345);

        System.out.println(funcionariosArray[4].getNome() + " * " + funcionariosArray[4].getNumeroMatricula());

        Funcionario funcionario10 = getFuncionarioPelaMatricula(funcionariosLista, 10);
        Funcionario funcionario12345 = getFuncionarioPelaMatricula(funcionariosLista, 12345);
        Funcionario funcionario123456 = getFuncionarioPelaMatricula(funcionariosLista, 123456);
        if (funcionario123456 != null){
            System.out.println(funcionario123456.getNome());
        } else {
            System.out.println(funcionario123456);
        }

        funcionariosLista.remove(funcionario10);
        funcionariosLista.remove(new Funcionario("José", 1234));

        System.out.println(funcionario10.getNome() + " * " + funcionario10.getNumeroMatricula());
        System.out.println(funcionario12345.getNome() + " * " + funcionario12345.getNumeroMatricula());
    }

    public static Funcionario getFuncionarioPelaMatricula(
            List<Funcionario> funcionarios,
            int matricula
    ){
        for (Funcionario f :
                funcionarios) {
            if (f.getNumeroMatricula() == matricula) {
                return f;
            }
        }
        return null;
    }

}
