/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somadowhile;

import java.util.Scanner;

/**
 *
 * @author renan
 */
public class SomadoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n, s = 0;
        String resp = "";
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N]");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma é igual a  " + s);
    }
}
