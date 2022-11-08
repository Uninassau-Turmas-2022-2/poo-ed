public class Microondas extends Eletrodomestico {

    private int potencia;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void imprimir(){
        System.out.println("Este eletrodoméstico é um microondas e a sua potência é "
                + this.potencia + ". Este eletroméstico trabalha em "  + this.getVoltagem() + "volts");
    }
}
