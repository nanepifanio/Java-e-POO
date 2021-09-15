
package people;

public class Livro implements Publicacao {
    
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setLeitor(leitor);
    }

    public void detalhes() {
        System.out.println("<<<<<<<<< LIVRO >>>>>>>>>");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Páginas: " + this.getTotPaginas());
        System.out.println("Página Atual: " + ((this.getPagAtual() == 0)?"---":this.getPagAtual()));
        System.out.println("Aberto/Fechado: " + ((this.getAberto())?"Aberto":"Fechado"));
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println("Idade: " + this.leitor.getIdade());
        System.out.println("Sexo: " + this.leitor.getSexo());
        System.out.println("-------------------------");
    }   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (this.getAberto()) {
            System.out.println("O Livro já está aberto!!");
        } else {
            System.out.println("Abrindo...");
             this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (this.getAberto() == false) {
            System.out.println("O livro já esta fechado!");
        } else {
            System.out.println("Fechando...");
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(int p) {
        if (p <= this.getTotPaginas()) {
            System.out.println("Indo para a página " + p + "...");
            this.setPagAtual(p);
        } else {
            System.out.println("O livro só tem " + this.getTotPaginas() + " páginas!!");
        }
    }

    @Override
    public void avancarPag() {
       if (this.getAberto()) {
           System.out.println("Avançando uma página...");
          this.setPagAtual(this.getPagAtual() + 1);
       } else {
           System.out.println("Livro fechado!");
       }  
    }

    @Override
    public void voltarPag() {
        if (this.getAberto()) {
            System.out.println("Voltando uma página...");
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Livro fechado!");
        }
    }

    
}
