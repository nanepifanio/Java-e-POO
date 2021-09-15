
package reinoanimal;

public class Reptil extends Animal {
    
    private String corescama;

    public String getCorescama() {
        return "\nCor da escama = " + corescama + "\n";
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }
    
    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos, vegetais ou carne...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil...\n\n");
    }
    
}
