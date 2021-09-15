/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

/**
 *
 * @author renan
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {1, 2, 3, 4, 5, 6}; //ou int n[] = new int[6]; (depois e atribuir valores)
        //for each:
        for (int valor: n) {
            System.out.print(valor + " ");
        }
    }
    
}
