
package videos;

public class Visualizacao {
    private Usuario espectador;
    private Video filme;

    public Visualizacao(Usuario espectador, Video filme) {
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.filme.play();
        this.espectador.viuMaisUm();
    }
    
    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc) {
        
    }

    @Override
    public String toString() {
        return "espectador: " + espectador + "\n\nfilme: " + filme;
    }
    
    
}
