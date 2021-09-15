
package videos;

public class Videos {

    public static void main(String[] args) {
        
        
        
        Video v[] = new Video[5];
        v[0] = new Video("Java POO");
        v[1] = new Video("PHP POO");
        v[2] = new Video("Javascript");
        v[3] = new Video("HTML");
        v[4] = new Video("CSS");
        
        Usuario u[] = new Usuario[3];
        u[0] = new Usuario("Renan", 25, 'M', "XxEpifaniusxX");
        u[1] = new Usuario("Ingrid", 24, 'F', "Ingmm8");
        u[2] = new Usuario("Duda", 13, 'F', "MadU");
        
        Visualizacao vs[] = new Visualizacao[3];
        vs[0] = new Visualizacao(u[0], v[0]);
        System.out.println(vs[0].toString());
        vs[1] = new Visualizacao(u[0], v[1]);
        System.out.println(vs[1].toString());
        
    }
    
}
