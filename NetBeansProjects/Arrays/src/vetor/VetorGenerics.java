
package vetor;

import java.lang.reflect.Array;

/**
*
* Essa classe resolve o problema da classe object, pois nela, como você generaliza os tipos que você quer trabalhar
* , acaba ferindo o principio de vetor de que deve conter só um tipo primitivo, já que, em um vetor object, eu posso
* colocar qualquer tipo dentro dele, tudo misturado.
* 
* Assim, com o recurso Generics, na declaração do vetor que queremos trabalhar, temos que colocar o tipo que será
* trabalhado, entre "<>" (Exemplo: VetorGenerics<String> = new VetorGenerics()), dinamicamente.
* 
* 
* 
*/

public class VetorGenerics<T> {  // "<>" -> operador diamond
    
    private T[] elementos; // "T" significa "type", 
    private int tamanho; 
    
    // Modo mais elegante e mais fácil de entender:
     public VetorGenerics(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];  //Solução do livro Effective java
        this.setTamanho(0);
    }
    
    // Modo mais complexo, menos elegante: 
    public VetorGenerics(int capacidade, Class<T> tipoclasse) {
        this.elementos = (T[]) Array.newInstance(tipoclasse, capacidade); // API Reflexion, para acessar dinamicamente os tipos do seu projeto
        this.setTamanho(0);
    }

    public Object getElementos(int posicao) { 
        
       if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição do array vazia ou inexistente!");
        }      
        return this.elementos[posicao];
        
    }
        
    public int getElementos(T elemento) {
        
         for(int i = 0 ; i < this.getTamanho() ; i++) {
            if(this.elementos[i].equals(elemento)) {
               return i;
            } 
         }
         return -1;
         
    }
    
    public boolean contem(T elemento) {
        return this.getElementos(elemento) > -1; //ou ">= 0"
    }
    
    public int ultimoIndice(T elemento) {
        /*
        int c = 0, pos = 0;
         for(int i = 0 ; i < this.getTamanho() ; i++) {
            if(this.elementos[i].equals(elemento)) {
               c++;
               pos = i;
            } 
         }
         
         if (c == 1 ) {
             return pos;
         } else if (c >= 1) {
            return pos;
         }
         
         return -1;
         */
        
        // Dessa forma, ele achará mais rapido a ultima posição do elemento, pois estará buscando de traz pra frente:
         for(int i = this.getTamanho() - 1 ; i >= 0 ; i--) {
            if(this.elementos[i].equals(elemento)) {
               return i;
            } 
         }
         return -1;
        
    }
    
    public void setElementos(T elemento) throws Exception { 
        
        this.aumentarCapacidade(); 
        
        if (this.getTamanho() < this.elementos.length) {
            this.elementos[this.getTamanho()] = elemento;
            this.setTamanho(this.getTamanho() + 1);
        } else {
            throw new Exception("Vetor cheio, não é possível adicionar mais elementos.");
        }
        
    }
    
    public void setElementos(int posicao, T elemento) {
        
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
    
    public void removeElementos(T elemento) {
         int pos = this.getElementos(elemento);
         if (pos > -1) {
             this.removeElementos(pos);
         } else { 
             System.out.println("Elemento não existe no vetor.");
         }
    }
    
    public void limpar() {
         //Opção 1:
        // this.elementos = (T[]) new Object[this.elementos.length];
         
         //Opção 2:
         //this.setTamanho(0);
         
         //Opção 3 (remove o lixo):
         for(int i = 0 ; i  < this.getTamanho() ; i++) {
             this.elementos[i] = null;
         }
         this.setTamanho(0);
    }
    
    private void aumentarCapacidade() {

        if (this.getTamanho() == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
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
