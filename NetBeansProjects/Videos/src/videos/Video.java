
package videos;

public class Video implements AcoesVideo {
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setCurtidas(0);
        this.setViews(0);
        this.setReproduzindo(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (this.getReproduzindo()) {
            System.out.println("Já está sendo reproduzido!!");
        } else {
            this.setReproduzindo(true);
            this.setViews(this.getViews() + 1);
            System.out.println("Reproduzindo...");
        }
    }

    @Override
    public void pause() {
        if (this.getReproduzindo()) {
            this.setReproduzindo(false);
            System.out.println("Pausando...");
        } else {
            System.out.println("Já está pausado!!");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "\ntitulo = " + titulo + "\navaliacao = " + avaliacao + "\nviews = " + 
                views + "\ncurtidas = " + curtidas + "\nreproduzindo = " + 
                ((reproduzindo)?"Sim\n":"Não\n");
    }
    
    
       
}
