
package calcularcr;

public class Disciplina{
    private float n;
    private int ncd;
    
    protected Disciplina(float n, int ncd) {
        this.setN(n);
        this.setNCD(ncd);
    }

    protected float getN() {
        return n;
    }

    protected void setN(float n) {
        this.n = n;
    }

    protected int getNCD() {
        return ncd;
    }

    protected void setNCD(int ncd) {
        this.ncd = ncd;
    }
    
}
