import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setNome("Daivid");
        helloWorld.imprimir();

        HelloWorld helloWorld2 = new HelloWorld();
        helloWorld2.setNome("Welligton");
        helloWorld2.imprimir();

        HelloWorld helloWorld3 = new HelloWorld();
        helloWorld3.imprimir();

    }

    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void imprimir(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()) +
                " - Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
    }

}