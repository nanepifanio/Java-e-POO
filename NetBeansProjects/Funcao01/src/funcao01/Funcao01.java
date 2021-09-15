/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

import funcao01.Fatorial;

/**
 *
 * @author renan
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatorial f = new Fatorial(); //O objeto  (f) criado pela instancia "new" agora tem os métodos da classe "Fatorial", ele pertence a classe fatorial agora.
        f.setValor(5); //método setValor (público)
        System.out.print(f.getFormula()); //método getFormula (público)
        System.out.println(f.getFatorial()); //método getFatorial (todos esses métodos podem ser vistos na classe "Fatorial")(público)
    }
    
}
