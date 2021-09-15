
package banco;

public interface Conta {
    //Métodos abstratos
    public abstract void estadoAtual();
    public abstract void sacar(double s);
    public abstract void depositar(double d);
    public abstract void abrirConta();
    public abstract void fecharConta();
    public abstract void pagarMensalidade();
    
}
