
package calcularcr;


public class CoefR implements Calculo {
    private float cr;
    private float cra;

    @Override
    public void CalcCr(float s, int t) {
        this.setCr(s/t);
    }

    @Override
    public void CalcCra(float s) {
        
    }

    protected float getCr() {
        return cr;
    }

    private void setCr(float cr) {
        this.cr = cr;
    }

    protected float getCra() {
        return cra;
    }

    private void setCra(float cra) {
        this.cra = cra;
    }
    
    
}
