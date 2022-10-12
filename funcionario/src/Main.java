public class Main {

    public static void main(String[] args) {
        Funcionario ze = new Funcionario();
        ze.setNome("Zezinho");
        ze.setSalario(1000.0);

        Funcionario joao = new Funcionario();
        joao.setNome("Joaozinho");
        joao.setSalario(10000.0);

        ze.setSalario(2000.0);

        joao.imprimir();
        ze.imprimir();
    }

}
