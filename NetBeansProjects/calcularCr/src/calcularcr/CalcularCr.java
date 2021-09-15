
package calcularcr;

import java.util.Scanner;

public class CalcularCr {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nº de disciplinas: ");
        int ndisc = scan.nextInt();
        
        Disciplina disc[] = new Disciplina[ndisc];
        
        for (int i = 0 ; i < disc.length ; i++) {
            System.out.println("=======================");
            System.out.println("Disciplina " + (i+1) + ":");
            System.out.print("Média final: ");
            float mf = scan.nextFloat();
            System.out.print("Número de créditos: ");
            int ndc = scan.nextInt();
            disc[i] = new Disciplina(mf, ndc);
            System.out.println("=======================");
        }
        
        float sum = 0;
        int totc = 0;
        for(int i = 0; i < disc.length ; i++) {
            sum += (disc[i].getN() * disc[i].getNCD());
            totc += disc[i].getNCD();
        }
        
        CoefR cr = new CoefR();
        cr.CalcCr(sum, totc);
        System.out.println("CR: " + cr.getCr());
        
        CoefR cra = new CoefR();
        
         
    }
    
}
