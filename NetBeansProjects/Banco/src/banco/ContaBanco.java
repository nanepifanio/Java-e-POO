
package banco;

public class ContaBanco implements Conta {
    
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Construtor
    public ContaBanco() {
        this.getStatus();
        this.getSaldo();
    }
    
    //Métodos específicos
    @Override
    public void estadoAtual() {
        System.out.println("==================================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Status: " + ((this.getStatus())?"Aberta":"Fechada"));
        System.out.println("Cliente: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Tipo: " + this.getTipo());
         System.out.println("==================================");
    }
    @Override
    public void abrirConta() {
        this.setStatus(true);
        if (this.getTipo() == "CC") {
            this.setSaldo(50);
        } else if (this.getTipo() == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }
    
    @Override
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("<<ATENÇÃO>><<Saque todo seu saldo para prosseguir com o encerramento da conta!>>");
        } else if (this.getSaldo() < 0) {
            System.out.println("<<ATENÇÃO>><<Você tem débito na conta. Quite-os para prosseguir com o encerramento!>>");
        } else {
            this.setStatus(false);
            System.out.println("Conta Encerrada!");
        }
    }
    
    @Override
    public void pagarMensalidade() {
        if (this.getStatus()) {
           if (this.getTipo() == "CC") {
                if (this.getSaldo() >= 12 ) {
                     this.setSaldo((float) (this.getSaldo() - 12));
                } else {
                    System.out.println("<<ATENÇÃO>><<Saldo insuficiente para pagar a mensalidade!");
                }
            }
            if (this.getTipo() == "CP") {
                if (this.getSaldo() >= 20) {
                    this.setSaldo((float) (this.getSaldo() - 20));
                } else {
                    System.out.println("<<ATENÇÃO>><<Saldo insuficiente para pagar a mensalidade!");
                }
            }
        } else {
            System.out.println("<<ATENÇÃO>><<Conta inexistente!>>");
        }
    }

    /**
     *
     * @param v
     */
    @Override
    public void depositar(double v) {
        if (this.getStatus()) {
            this.setSaldo((float) (this.getSaldo() + v));
            System.out.println("Depósito de R$" + v + " realizado na conta de " + this.getDono());
        } else {
            System.out.println("<<ATENÇÃO>><<Conta inexistente!>>");
        }
    }
    
    @Override
    public void sacar(double v) {
         if (this.getStatus()) {
             if (this.getSaldo() >= v) {
                  this.setSaldo((float) (this.getSaldo() - v));
                  System.out.println("Saque de R$" + v + " realizado na conta de " + this.getDono());
             } else {
                 System.out.println("<<ATENÇÃO>><<Saldo insuficiente para realizar o valor do saque!>>");
             }
        } else {
            System.out.println("<<ATENÇÃO>><<Conta inexistente!>>");
        }
    }
    
    //Métodos Especiais(Acessores)
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float sal) {
        this.saldo = sal;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean stat) {
        this.status = stat;
    }
    
}
