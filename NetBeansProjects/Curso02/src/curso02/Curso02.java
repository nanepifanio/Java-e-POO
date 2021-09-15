
package curso02;

public class Curso02 {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.setNome("Renan");
        a1.setIdade(25);
        a1.setSexo('M');
        a1.setCurso("Análise e Desenvolvimento de Sistemas");
        a1.setMatr(1111);
        
        System.out.println(a1.toString() + a1.getCurso() + "\nMatrícula = " + a1.getMatr());
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Ingrid");
        b1.setIdade(24);
        b1.setSexo('F');
        b1.setCurso("Língua Portuguesa");
        b1.setMatr(2222);
        b1.setBolsa(12.5f);
        
        System.out.println("\n\n");
        System.out.println(b1.toString() + b1.getCurso() + "\nMatrícula = " + b1.getMatr());
        b1.pagarMensalidade();
    }
    
}
