
package people;

public class People {

    public static void main(String[] args) {
        
        Pessoa p[] = new Pessoa[2];
        p[0] = new Pessoa("Renan", 25, "M");
        p[1] = new Pessoa("Ingrid", 24, "F");
                
        Livro l[] = new Livro[3];
        l[0] = new Livro("O Rei do Inverno", "Bernard Cornwell", 546, p[0]);
        l[1] = new Livro("Mistborn Vol. 1", "Brandon Sanderson", 608, p[1] );
        l[2] = new Livro("Os Pilares da Terra", "Ken Follet", 944, p[0]);
       
        l[0].detalhes();
        l[0].abrir();
        l[0].detalhes();
        l[0].avancarPag();
        l[0].detalhes();
        l[0].avancarPag();
        l[0].detalhes();
        l[0].voltarPag();
        l[0].detalhes();
        p[0].fazerAniversario();
        l[0].detalhes();
        l[0].folhear(550);
        l[0].detalhes();
        l[0].folhear(500);
        l[0].detalhes();
        l[0].fechar();
        l[0].detalhes();
        l[0].avancarPag();
        l[0].fechar();
        
        l[1].detalhes();
        l[1].abrir();
        l[1].detalhes();
    }
    
}
