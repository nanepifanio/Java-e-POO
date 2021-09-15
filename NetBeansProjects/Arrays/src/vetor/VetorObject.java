
package vetor;

public class VetorObject {
     
    private Object[] elementos; // generaliza o tipo do vetor, pois a classe object é super de todas as outras
    private int tamanho; 
    
    public VetorObject(int capacidade) {
        this.elementos = new Object[capacidade];  
        this.setTamanho(0);
    }

    public Object getElementos(int posicao) { 
        
       if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição do array vazia ou inexistente!");
        }      
        return this.elementos[posicao];
        
    }
        
    public int getElementos(Object elemento) {
        
         for(int i = 0 ; i < this.getTamanho() ; i++) {
            if(this.elementos[i].equals(elemento)) {
               return i;
            } 
         }
         return -1;
         
    }
    
    public void setElementos(Object elemento) throws Exception { 
        
        this.aumentarCapacidade(); 
        
        if (this.getTamanho() < this.elementos.length) {
            this.elementos[this.getTamanho()] = elemento;
            this.setTamanho(this.getTamanho() + 1);
        } else {
            throw new Exception("Vetor cheio, não é possível adicionar mais elementos.");
        }
        
    }
    
    public void setElementos(int posicao, Object elemento) {
        
       if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição do array vazia ou inexistente!");
        } 
       
       this.aumentarCapacidade(); 
      
       for (int i = this.getTamanho() - 1 ; i  >= posicao ; i--) {
           this.elementos[i+1] = this.elementos[i];
       }
       
       this.elementos[posicao] = elemento;
       this.setTamanho(this.getTamanho() + 1);
    }         
    
    private void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public int getTamanho() {
        return this.tamanho;
    }
    
    public void removeElementos(int posicao) {

        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição do array vazia ou inexistente!");
        } 
       
       for (int i = posicao ; i < this.getTamanho() - 1 ;  i++) {
           this.elementos[i] = this.elementos[i  + 1];
        }
       
       this.setTamanho(this.getTamanho() - 1);
       
    }
    
    private void aumentarCapacidade() {

        if (this.getTamanho() == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0 ; i < this.elementos.length ; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos; 
        }
        
    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        
        for(int i = 0 ; i < this.getTamanho() - 1 ; i++) {
            s.append(this.elementos[i]); 
            s.append(", ");
        }
        
        if (this.getTamanho() > 0) { 
            s.append(this.elementos[this.getTamanho() - 1]);
        }
        
        s.append("]");
        
        return s.toString();
    }
}
