
package pilhas;

public class Pilha<T> {
    
    private T[]  elementos;
    private int tamanho;
    
    public Pilha (int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    
    public void empilha(T elemento) {
        
    }
    
    public void aumentaCapacidade() {
        
         if (this.tamanho() == this.elementos.length) {
             
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0 ; i < this.elementos.length ; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos; 
            
        }
    }
    
    public boolean estaVazia() {
        
    }
    
    public T topo() {
        
    }
    
    public T desempilha() {
        
    }
    
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        
         StringBuilder s = new StringBuilder();
        
        s.append("[");
        
        for(int i = 0 ; i < this.tamanho() - 1 ; i++) {
            s.append(this.elementos[i]); 
            s.append(", ");
        }
        
        if (this.tamanho() > 0) { 
            s.append(this.elementos[this.tamanho() - 1]);
        }
        
        s.append("]");
        
        return s.toString();
      
    }
    
    
    
}
