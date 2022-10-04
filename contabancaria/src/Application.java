import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Endereco meuEndereco = new Endereco(
                "50.000-000",
                "Jardim Paulista",
                "55",
                "Paulista",
                "PE",
                "Brasil"
        );

        Agencia agencia = new Agencia("09876543-2", meuEndereco);
        Conta conta = new Conta(
                "9876543-32",
                10000.00,
                "poupança",
                agencia
        );
        Cliente cliente = new Cliente(
                "000.000.000-00",
                "Daivid",
                conta
        );
        cliente.imprimirInfoCliente();
    }
}
