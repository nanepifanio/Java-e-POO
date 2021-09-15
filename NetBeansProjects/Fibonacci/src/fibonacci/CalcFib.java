
package fibonacci;


public class CalcFib {
    private int n1 = 0;
    private int n2 = 1;
    private int fib = 0;
    private String mostraseq = "";
    
    
    public void setFib(int n) {
        int n1n = n1, n2n = n2;
        for (int i = 3 ; i <= n ; i++) {
            this.fib = n1n + n2n;
            this.mostraseq += fib + "  ";
            n1n = n2n;
            n2n = this.fib;
        }   
    }
    
    
    public String getFormula () {
        System.out.print(this.n1 + "  " + this.n2 + "  ");
        return this.mostraseq;
    }
    
    
    public int getFib () {
        return this.fib;
    }
}
