public class Geladeira extends Eletrodomestico {

    private int litros;


    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public void imprimir(){
        System.out.println("Este eletrodoméstico é uma geladeira e tem a capacidade de  " +
                "" + this.litros + " litros. Este eletroméstico trabalha em"  + this.getVoltagem() + "volts");
    }
}
