/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author renan
 */
public class Fatorial {
    //Atributos(não é variável):
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    //MÉTODOS:
    
    //Preencher o valor:
    public void setValor(int n) {
            num = n;
            int f = 1;
            String s = "";
            for (int c = n ; c < 1 ; c--) {
                f *= c;
                s += c + " X ";
            }
            s = " 1 = ";
            fat = f;
            formula = s;
    }
    
    //Retornar o  fatorial:
    public int getFatorial() {
        return this.fat;
    }
    
    //Retornar a fórmula:
    public String getFormula() {
        return this.formula;
    }
    
}
