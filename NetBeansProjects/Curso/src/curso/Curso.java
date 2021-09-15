
package curso;

public class Curso {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Renan");
        p2.setNome("Ingrid");
        p3.setNome("Patrícia");
        p4.setNome("Marconi");
        
        p1.setIdade(25);
        p1.setSexo('M');
        
        
        
        p2.setCurso("Lingua Portuguesa");
        p3.setSalario(2500.75f);
        p4.setSetor("Segurança");
        
        System.out.println(p1.toString());
    }
    
}
