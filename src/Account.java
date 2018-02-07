
/**
 *
 * @author walopes
 */
public class Account {
    
    /* The attributes goes here */
    
    // The number of the account
    public int numConta;
    // The type of the account
    //  "cc" (conta corrente) for the current/ checking account
    //  "cp" (conta poupança) for the savings account
    protected String tipo;
    // The name of the owner of the account
    private String dono;
    // The amount of money this account has
    private double saldo;
    // The status of the account 
    private boolean status;
    
    
    /* The methods goes here */
    
    public Account()
    {
        this.saldo = 0;
        this.status = false;
    }
    
    public void setNumConta(int conta)
    {
        this.numConta = conta;
    }
    
    public int getNumConta()
    {
        return this.numConta;
    }
    
    public void setTipo(String c)
    {
        this.tipo = c;
    }
   
    public String getTipo()
    {
        return this.tipo;
    }
    
    public void setStatus(boolean type)
    {
        if(type) this.status = true;
        else this.status = false;
    }
    
    public boolean getStatus()
    {
        return this.status;
    }
    
    public void setSaldo(double f)
    {
        this.saldo = f;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    ///
    
    public void abrirConta(String conta, int numConta)
    {
        this.setNumConta(numConta);
        this.setTipo(conta);
        if(conta.equals("cc"))
            this.setSaldo(50);
        else if(conta.equals("cp"))
            this.setSaldo(150);
    }
    
    public boolean fecharConta(int numConta)
    {
        if(this.saldo > 0)
            System.out.print("Conta possui dinheiro." + '\n' + "Não é possível excluir a conta");
        else if(this.saldo < 0)
            System.out.print("Conta com débitos." + '\n' + "Não é possível excluir a conta");
        else
        {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
            return true;
        }
        return false;
    }
    
    public boolean depositarConta(double valor)
    {
        if(this.getStatus())
        {
            this.setSaldo(valor + this.getSaldo());
            return true;
        }
        return false;
    }
    
    public boolean sacarConta(double valor)
    {
        if(this.getStatus())
        {
            this.setSaldo(this.getSaldo() - saldo);
            return true;
        }
        return false;
    }
    
}
