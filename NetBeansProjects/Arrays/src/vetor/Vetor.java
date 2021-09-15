
package vetor;

public class Vetor {
    
    private String[] elementos; // pode ser qualquer tipo primitivo, o escolhido para exemplo foi o String.
    private int tamanho; // guarda o tamanho real do vetor e a última posição acessada
    
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];  // autoboxing, onde passamos um tipo primitivo por parâmetro e criamos um objeto a partir daí
        this.setTamanho(0);
    }

    public String getElementos(int posicao) { 
        
        /* Modo errado, pois o usuário pode digitar qualquer valor, inclusive um valor fora do length do vetor:
         *
         *                               return  this.elementos[posicao];
         * 
         */
        
        /* Modo certo, pois se o usuário digitar uma posição  fora do escopo do array ou fora do tamanho real, 
          * a exceção "IllegalArgumentException" será chamada e o programa não irá executar a próxima linha.
          */
       if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição do array vazia ou inexistente!");
        }      
        return this.elementos[posicao];
    }
    
   
        
     /* Método menos elegante de verificar se um elemento existe:
    
             public boolean getElementos(String elemento) { 
    
                                for(int i = 0 ; i < this.getTamanho() ; i++) {
                                    if(this.elementos[i].equals(elemento)) {
                                        return true;
                                    } 
                                }
                                return false;
             }
    
        */
        
    public int getElementos(String elemento) {
        
         // Método mais elegante de verificar se um elemento existe (retorna a posição):
         for(int i = 0 ; i < this.getTamanho() ; i++) {
            if(this.elementos[i].equals(elemento)) {
               return i;
            } 
         }
         return -1;
    }
    

    public void setElementos(String elemento) throws Exception { 
        
        /* Forma ruim:
         * Adiciona o elemento sequencialmente, porém, não é o melhor método
         * pois o programa terá que verificar a todo momento se aquela posição
         * já foi preenchida.
         *   for(int i = 0 ; i < this.elementos.length ; i++) {
         *      if (this.elementos[i] == null) {
         *          this.elementos[i] = elemento;
         *          break;
         *      }
         *  }
         */
        
        this.aumentarCapacidade(); //tem que estar aqui caso o tamanho seja igual ao length do vetor
        
        /* Forma certa:
         * Dessa forma, verificando o tamanho real do vetor (o quantos ele está
         * preenchido), o vetor não precisa verificar posições que ele já preencheu
         * tornando o programa mais eficiente.
         */
        if (this.getTamanho() < this.elementos.length) {
            this.elementos[this.getTamanho()] = elemento;
            this.setTamanho(this.getTamanho() + 1);
        } else {
            throw new Exception("Vetor cheio, não é possível adicionar mais elementos.");
        }
        /*Outra forma certa, sem usar exceção throw (semelhante a outra):
            public boolean setElementos(String elemento) {
                if (this.tamanho < this.elementos.length) {
                    this.elementos[this.getTamanho()] = elemento;
                    this.setTamanho(this.getTamanho() + 1);
                    return true;
                } else {
                    return false;
                }
            }
        */
        
    }
    
    public void setElementos(int posicao, String elemento) {
        
        // Confere se o usuário digitou uma posição válida:
       if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição do array vazia ou inexistente!");
        } 
       
       this.aumentarCapacidade(); //tem que estar aqui caso o tamanho seja igual ao length do vetor
       
       // Move os elementos já existentes para sua nova posição, para dar espaço para o elemento novo ( analisar sempre de trás pra frente):
       for (int i = this.getTamanho() - 1 ; i  >= posicao ; i--) {
           this.elementos[i+1] = this.elementos[i];
       }
       
       // Atribui o novo elemento a posição desejada e adiciona o tamanho real do vetor:
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
       // Confere se o usuário digitou uma posição válida:
       if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição do array vazia ou inexistente!");
        } 
       
        // Move os elementos já existentes para sua nova posição, ocupando o espaço do elemento removido ( analisar sempre de trás pra frente):
       for (int i = posicao ; i < this.getTamanho() - 1 ;  i++) {
           this.elementos[i] = this.elementos[i  + 1];
       }
       
       //Diminui o tamanho real do vetor:
       this.setTamanho(this.getTamanho() - 1);
       
    }
    
    private void aumentarCapacidade() {
        // Aumenta a capacidade do vetor caso o tamanho real atinja o length do vetor:
        if (this.getTamanho() == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2]; // É concordância geral que deve dobrar o valor do vetor.
            for (int i = 0 ; i < this.elementos.length ; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos; // atribui o novo vetor criado ao atributo da classe, modificando assim seu length
        }
    }

    @Override
    public String toString() {
        
        /* Modo menos eficiente, menos elegante:
         * String s = "[";
         * for(int i = 0 ; i < this.getTamanho() - 1 ; i++) {
         *     s += this.elementos[i]; 
         *     s += ", ";
         * }
         * if (this.getTamanho() > 0) { para não ocorrer nenhuma exceção
         *     s += this.elementos[this.getTamanho() - 1];
         * }
         * s += "]";
         * return Arrays.toString(this.elementos)
         */
        
        //Modo mais eficiente, mais elegante:
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
