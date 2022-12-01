import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();
        lista.add(10);
        lista.add(25);
        lista.add(37);
        lista.add(42);
        lista.add(57);
        lista.get(3);

        List<Funcionario> funcionarios = new ArrayList<>();

       int[] array = {10, 25, 37, 42, 57};
       array[5] = 3;

       Integer[] inteiros = new Integer[5];

       char[] cs = new char[3];
       System.out.println("Char: " + cs[0]);

       String[] strings = new String[5];
       System.out.println("Strings: " +strings[0]);

       inteiros[0] = 65;

       System.out.println("Array: " + array[0]);
       System.out.println("Inteiros: " + inteiros[0]);
       inteiros[0] = array[0];
       array[1] = 76;
       System.out.println("Array: " + array[1]);
       System.out.println("Inteiros: " + inteiros[0]);


       Funcionario[] funcionarios =
               {
                       new Funcionario("Daivid"),
                       new Funcionario("João"),
               };

       System.out.println(funcionarios[0].getName());

       funcionarios[0] = new Funcionario("Berg");

       System.out.println(funcionarios[0].getName());


    }

}
