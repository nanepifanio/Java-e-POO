
package curso02;

public final class Bolsista extends Aluno {
    
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa() {
        System.out.println("Bolsa Renovada!!");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista. Pagamento facilitado, com " + this.getBolsa() + "% de desconto!!");
    }
    
}
