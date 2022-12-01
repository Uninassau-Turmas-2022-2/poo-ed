public class Funcionario {

    public Funcionario(){}

    public Funcionario(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public Funcionario(String nome, double salario, int numeroMatricula) {
        this.nome = nome;
        this.salario = salario;
        this.numeroMatricula = numeroMatricula;
    }

    private final double PERCENTUAL_CUSTO = 1.8;
    private String nome;
    private double salario;
    private double custo;
    private int numeroMatricula;

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    protected double getPercentualCusto(){
        return PERCENTUAL_CUSTO;
    }

    public double getCusto() {
        return custo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        this.custo = salario * getPercentualCusto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Olá meu nome é: "
            + this.getNome() + ". Eu recebo "
            + this.getSalario() + " de salário."
            + " E tenho um custo de " + this.getCusto() + " para a empresa!");
    }
}
