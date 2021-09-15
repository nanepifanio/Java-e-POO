
package reinoanimal;

public class Aves extends Animal {
    
    private String corpena;

    public String getCorpena() {
        return "\nCor da pena = " + corpena + "\n";
    }

    public void setCorpena(String corpena) {
        this.corpena = corpena;
    }
    
    public final void fazerNinho() {
        System.out.println("Construindo o ninho...");
        
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos, grãos e frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piando...\n");
    }
    
}
