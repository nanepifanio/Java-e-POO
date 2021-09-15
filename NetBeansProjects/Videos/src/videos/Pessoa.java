
package videos;

public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    protected char sexo;
    protected float experiencia;

    public Pessoa(String nome, int idade, char sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 0.5f);
    }

    @Override
    public String toString() {
        return "nome = " + nome + "\nidade = " + idade + "\nsexo = " + sexo +
                "\nexperiencia = " + experiencia;
    }
    
    
}
