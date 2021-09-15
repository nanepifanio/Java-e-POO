
package reinoanimal;

public class Peixe extends Reptil {
    
    public final void soltarBolha() {
        System.out.println("Soltou uma bolha...");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Algas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som!!\n\n");
    }
    
}
