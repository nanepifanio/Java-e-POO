
package ultimateemojicombat;

public class Disputa implements Disp {
    private Lutador desafiado;//Agregação
    private Lutador desafiante;//Agregação
    private int rounds;
    private boolean aprovada;


    private Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    private Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    private int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
      if (l1.getCategoria().equals(l2.getCategoria())) {
          if (l1.getNome().equals(l2.getNome())) {
              this.setAprovada(false);
              System.out.println("Impossível um lutador lutar contra ele próprio");
          } else {
              this.setAprovada(true);
               this.desafiante = l1;
               this.desafiado = l2;
          }
      } else { 
          this.setAprovada(false);
          System.out.println("A luta não pode acontecer, pois as categorias são diferentes");
      }
    }

    @Override
    public void lutar() {
       if (this.getAprovada()) {
         System.out.println("### DESAFIANTE ###");
         this.desafiante.apresentar();
         System.out.println("### DESAFIADO ###");
         this.desafiado.apresentar();
         int vencedor = (int)(0 + (Math.random()) * (3-0));
         /* Random aleatorio = new Random();
           * int vencedor = aleatorio.nextInt(3);       
           */
         if (vencedor == 0) {
             this.desafiante.empatarLuta();
             this.desafiado.empatarLuta();
             System.out.println("Luta empatada!");
             this.desafiante.status();
             this.desafiado.status();
             this.setAprovada(false);
         } else if (vencedor == 1) {
             this.desafiante.ganharLuta();
             this.desafiado.perderLuta();
             System.out.println("O vencedor foi " + this.desafiante.getNome());
             this.desafiante.status();
             this.desafiado.status();
             this.setAprovada(false);
         } else {
             this.desafiado.ganharLuta();
             this.desafiante.perderLuta();
             System.out.println("O vencedor foi " + this.desafiado.getNome());
             this.desafiante.status();
             this.desafiado.status();
             this.setAprovada(false);
         }
       } else {
           System.out.println("A luta não pode acontecer");
       }
    }
    
}
