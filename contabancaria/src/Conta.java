public class Conta {

    private String numero;
    private Double saldo;
    private String tipo;
    private Agencia agencia;

    public Conta(String numero, Double saldo, String tipo, Agencia agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
        this.agencia = agencia;
    }

    public void imprimir(){
        System.out.println("O número da conta " + this.getTipo() +" é: " +
                this.getNumero() + " com saldo: " + this.getSaldo());
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public Agencia getAgencia() {
        return agencia;
    }
}
