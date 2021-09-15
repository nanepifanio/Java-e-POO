
package reinoanimal;

public class Mamifero extends Animal {
    
    private String corpele;

    public String getCorpele() {
        return "\nCor da pele = " + corpele + "\n";
    }

    public void setCorpele(String corpele) {
        this.corpele = corpele;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    public final void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero...\n\n");
    }
    
}
