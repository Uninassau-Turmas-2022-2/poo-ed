public class Application {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Daivid");
        funcionario.setSalario(1000);
        funcionario.imprimir();

        Programador programador = new Programador();
        programador.setNome("Daivid Programador");
        programador.setSalario(100000);
        programador.setLinguagens("PHP, Java, JavaScript");
        programador.imprimir();

        Gerente gerente = new Gerente();
        gerente.setNome("Daivid Gerente");
        gerente.setSalario(100000);
        gerente.setSubordinados("Daivid Programador, Daivid Secretário");
        gerente.imprimir();

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Daivid Secretário");
        secretaria.setSalario(10000);
        secretaria.setAgenda("Seg - Sala 1, Terça - Sala 2");
        secretaria.imprimir();

    }

}
