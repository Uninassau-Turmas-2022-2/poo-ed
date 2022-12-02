public class Funcionario {

    private int id;
    private String name;
    private double salario;
    private final double PERCENTUAL_CUSTO = 1.8;
    private double custo;

    public Funcionario(int id, String name, double salario) {
        this.id = id;
        this.name = name;
        this.setSalario(salario);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
        this.custo = salario * this.getPERCENTUAL_CUSTO();
    }

    public double getCusto() {
        return custo;
    }

    public double getPERCENTUAL_CUSTO() {
        return PERCENTUAL_CUSTO;
    }

    public void imprimir(){
        System.out.println(
                "Olá, eu sou o funcionário " + this.getName()
                        + " tenho um salário de " + this.getSalario()
                        + " e custo " + this.getCusto() + " para a empresa que trabalho!"
        );
    }

}
