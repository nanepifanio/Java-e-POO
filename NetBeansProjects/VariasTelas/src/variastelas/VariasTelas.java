/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variastelas;

import javax.swing.JOptionPane;

/**
 *
 * @author renan
 */
public class VariasTelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*   JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE); 
          *   Mostra mensagem num painel. WARMING_MESSAGE é somente um dos vário ícones que podem ser mostrados (ver as opções depois do ".")
          */
        /*int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor: ")); //ENTRADA DE DADOS (PODE SER COLOCADO DENTRO DE VARIÁVEL OU SEM VARIÁVEL)
                                                                                                                      //PRA ISSO, CASO O DADO SEJA UM NUMERO,DEVE-SE FAZER A CONVERSÃO, POIS É STRING.
        JOptionPane.showMessageDialog(null, "O valor informado foi: " + n);*/
        int val, totval = 0, totpar = 0, totimpar = 0, acima100 = 0, somaval = 0;
        while (true) {
            val = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor:<br><em>(0 interrompe)<em></html>"));
            if (val == 0) {
                break;
            }
            totval++;
            somaval += val;
            if (val % 2 == 0) {
               totpar++;
            } else {
                totimpar++;
            }
         if (val > 100) {
               acima100++;
           }   
        }
        int media = somaval/totval;
        JOptionPane.showMessageDialog(null, "<html>Resultado<hr>" + "<br>Total de Valores: " + totval + "<br>Total de Pares: " + totpar + 
                "<br>Total de Ímpares: " + totimpar + "<br>Acima de 100: " + acima100 + "<br>Média dos valores: " + media + "</html>", "Resultado Final",
                JOptionPane.WARNING_MESSAGE );
    }
    
}
