
package reinoanimal;

public final class Canguru extends Mamifero {
    
    public void usarBolsa() {
        System.out.println("Colocando o filhote na bolsa...");
    }
    
    @Override
    public void locomover() {
        System.out.println("Saltando...\n\n");
    }
    
}
