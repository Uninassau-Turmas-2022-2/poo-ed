import java.util.ArrayList;

public class Televisao extends Eletrodomestico {

    private int polegadas;
    private ArrayList<String> canais;

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public ArrayList<String> getCanais() {
        return canais;
    }

    public void setCanais(ArrayList<String> canais) {
        this.canais = canais;
    }

    public void imprimir(){
        System.out.println("Este eletrodoméstico é uma televisão e contem "
                + this.polegadas + " polegadas e os canais são: " + this.canais + ". Este eletroméstico trabalha em "  + this.getVoltagem() + "volts");
    }
}
