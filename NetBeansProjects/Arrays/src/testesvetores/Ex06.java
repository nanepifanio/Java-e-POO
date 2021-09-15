
package testesvetores;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import vetor.Contato;
import vetor.VetorGenerics;

public class Ex06 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //criação do vetor com capacidade 20:
        VetorGenerics<Contato> lista = new VetorGenerics(20);
        
        //cria e adiciona 30 contatos:
        criarContatosDinamicamente(30, lista);
        
        //menu opções para o usuário:
        menuOpcoes(scan);
    }
    
    public static void menuOpcoes(Scanner scan) {
        
        System.out.println("\t============================== OPÇÕES ==============================");
        System.out.println("\t1\tAdiciona contato no fim do vetor");
        System.out.println("\t2\tAdiciona contato numa posição específica do vetor");
        System.out.println("\t3\tObter contato de uma posição específica do vetor");
        System.out.println("\t4\tObter posição de um contato no vetor");
        System.out.println("\t5\tVerificar se o contato está no vetor");
        System.out.println("\t6\tObter o tamanho real do vetor");
        System.out.println("\t7\tRemove um contato de uma posição específica do vetor");
        System.out.println("\t8\tRemove um contato específico do vetor");
        System.out.println("\t9\tLimpa o vetor");
        System.out.println("\t10\tMostra o vetor");
        System.out.println("\t0\tSair");
        System.out.println("\t===================================================================");
       
        
    }
    
    public static void adicionaContato(Scanner scan, VetorGenerics<Contato> lista) {
        
                System.out.print("Nome: ");
                String nome = scan.nextLine();
                System.out.print("Número: ");
                String numero = scan.nextLine();
                System.out.print("Email: ");
                String email = scan.nextLine();
                
                Contato contato = new Contato(nome, numero, email);
                
                try {
                    lista.setElementos(contato);
                } catch (Exception ex) {
                    Logger.getLogger(Ex06.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
    public static void criarContatosDinamicamente(int quantidade, VetorGenerics<Contato> lista) {
        
        // obs.: não é uma boa prática instanciar objetos dentro de loops.
        Contato contato;
        
        for (int i = 1 ; i <= quantidade ; i++) {
            
            contato = new Contato(("Contato " + i), ("1" + i  + "1" + i + "1" + i + "1" + i + "1" + i  + "1"), ("contato" + i + "@email.com"));
            
            /*
            contato.setNome("Contato " + i);
            contato.setNumero("1" + i  + "1" + i + "1" + i + "1" + i + "1" + i  + "1");
            contato.setEmail("contato" + i + "@email.com");
            */
            
            try {
                lista.setElementos(contato);
            } catch (Exception ex) {
                Logger.getLogger(Ex06.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    
}
