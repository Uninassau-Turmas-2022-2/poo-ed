public class Eletrodomestico {

    private boolean ligado;
    private int voltagem;

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getVoltagem(){
        return this.voltagem;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("O eletrodoméstico já esta ligado!");
        } else {
            this.ligado = true;
            System.out.println("Você ligou o eletrodoméstico!");
        }
    }

    public void desligar(){
        if (this.ligado) {
           this.ligado = false;
           System.out.println("Você desligou o eletrodoméstico!");
        } else {
           System.out.println("O eletrodoméstico já esta desligado!");
        }
    }


}
