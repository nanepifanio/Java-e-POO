 
package curso02;

public class Aluno extends Pessoa {
    
    private String curso;
    private int matr;

    public String getCurso() {
        return "\nCurso = " + curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }
    
    public void pagarMensalidade() {
        System.out.println(this.getNome() + ", sua mensalidade foi paga com sucesso!!");
    }
    
}
