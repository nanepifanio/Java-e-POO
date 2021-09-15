
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual termo da sequência de fibonacci você quer ver? ");
        int fib = teclado.nextInt();
        teclado.close();
        CalcFib f = new CalcFib();
        f.setFib(fib);
        System.out.println(f.getFib());
    }
}
