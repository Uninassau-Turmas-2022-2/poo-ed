import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Fogao fogao = new Fogao();
        fogao.ligar();
        fogao.setVoltagem(220);
        fogao.setQtdBocas(6);
        fogao.imprimir();
        fogao.desligar();

        Televisao tv = new Televisao();
        tv.ligar();
        tv.setVoltagem(220);
        tv.setPolegadas(60);
        ArrayList<String> canais = new ArrayList<String>();
        canais.add("Tv cultura");
        canais.add("Rede Globo");
        canais.add("SBT");

        canais.remove(1);
        tv.setCanais(canais);
        tv.imprimir();
        tv.desligar();

        Geladeira geladeira = new Geladeira();
        geladeira.setLitros(450);
        geladeira.setVoltagem(220);
        geladeira.ligar();
        geladeira.imprimir();
        geladeira.desligar();

        Microondas microondas = new Microondas();
        microondas.setPotencia(700);
        microondas.ligar();
        microondas.setVoltagem(110);
        microondas.imprimir();
        microondas.desligar();




    }

}
