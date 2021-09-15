
package vetor;

public class Contato {
    
    private String nome;
    private String numero;
    private String email;

    public Contato(String nome, String numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }
    
    public Contato() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nome = " + nome + "numero = " + numero + " email = " + email + "\n";
    }
    
    
}
