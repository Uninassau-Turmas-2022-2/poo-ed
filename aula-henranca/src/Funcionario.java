public class Funcionario {

    private final double PERCENTUAL_CUSTO = 1.8;
    private String nome;
    private double salario;
    private double custo;

    public double getCusto() {
        return custo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        this.custo = salario * PERCENTUAL_CUSTO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Olá meu nome é: "
            + this.nome + ". Eu recebo "
            + this.salario + " de salário."
            + " E tenho um custo de " + this.custo + " para a empresa!");
    }
}
