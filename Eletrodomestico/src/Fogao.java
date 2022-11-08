public class Fogao extends Eletrodomestico {

    private int qtdBocas;

    public int getQtdBocas() {
        return qtdBocas;
    }

    public void setQtdBocas(int qtdBocas) {
        this.qtdBocas = qtdBocas;
    }

    public void imprimir() {
        System.out.println("Este eletrodoméstico é um fogão e contem " +
                this.qtdBocas + " bocas. Este eletroméstico trabalha em "  + this.getVoltagem() + "volts");
    }
}
