/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author renan
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva seu nome: ");
        String name = teclado.nextLine();
        System.out.print("Nota: ");
        float note = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n", name, note);
    }
    
}
