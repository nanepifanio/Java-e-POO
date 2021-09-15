
package banco;

public class Banco {
    
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Renan");
        p1.setTipo("CC");
        p1.abrirConta();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Ingrid");
        p2.setTipo("CP");
        p2.abrirConta();
      
        
        p2.sacar(150);
        p1.sacar(50);
        
        p1.fecharConta();
        p2.fecharConta();
        
         p1.estadoAtual();
         p2.estadoAtual();
        
        
    }
}
