
package ultimateemojicombat;

public class Lutador implements Luta {
    
    //Atributos
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos especiais
    
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;    
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso= peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.getPeso() > 66 && this.getPeso() <= 70) {
            this.categoria = "Leve";
        } else if (this.getPeso() > 77 && this.getPeso() <= 84) {
            this.categoria = "Médio";
        } else {
            this.categoria = "Pesado";
        }
    }

    private int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //Métodos implementados (específicos)

    @Override
    public void apresentar() {
        System.out.println("=========================");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Tem " + this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println("e " + this.getEmpates() + " empates.");
        System.out.println("=========================");
    }

    @Override
    public void status() {
        System.out.println("=========================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: Peso " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("=========================");
    }

    @Override
    public void ganharLuta() {
       this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
       this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
       this.setEmpates(this.getEmpates() + 1);
    }
    
}
