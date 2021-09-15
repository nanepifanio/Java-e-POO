
package videos;

public class Usuario extends Pessoa {
    
    private String login;
    private int totAssistindo;

    public Usuario(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistindo(0);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }
    
    public void viuMaisUm() {
        this.setTotAssistindo(this.getTotAssistindo() + 1);
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nlogin = " + login + "\ntotAssistido = " + totAssistindo;
    }
    
}
