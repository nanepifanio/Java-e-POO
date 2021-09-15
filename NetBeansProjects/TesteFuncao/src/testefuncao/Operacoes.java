/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author renan
 */
public class Operacoes {
   
    public static String contador (int i, int f) { //public significa que o método (no caso, contador pode ser acessado por qualquer um. Private é privado, não pode ser acessado por qualquer um. 
        String s = "";
        for (int c = i ; c <= f ; c++) {
            s += c + " ";
        }
        return s;
    }
}
