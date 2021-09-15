 
package curso;

public class Aluno extends Pessoa {
    private String curso;
    private int matr;

    public String getCurso() {
        return curso;
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
    
    public void cancelarMatr() {
        this.setMatr(0);
        System.out.println("Matrícula cancelada!!");
    }
}
