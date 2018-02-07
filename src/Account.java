
package contabanco;
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
         this.status = type;
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
    
    public void setDono(String dono)
    {
        this.dono = dono;
    }
    
    public String getDono()
    {
        return this.dono;
    }
    
    ///
    
    public void abrirConta(String conta, int numConta)
    {
        this.setNumConta(numConta);
        this.setTipo(conta);
        this.setStatus(true);
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
            this.setSaldo(this.getSaldo() + valor);
            return true;
        }
        return false;
    }
    
    public boolean sacarConta(double valor)
    {
        if(this.getStatus())
        {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
    
    public boolean pagarMensalidade()
    {
        if(this.getTipo().equals("cc")) // Current Account
            return this.sacarConta(12);
        else if(this.getTipo().equals("cp")) // Current Account
            return this.sacarConta(20);
        
        return false;
    }
    
    public void show()
    {
        System.out.println("********************************************");
        System.out.println("Account number: " +this.getNumConta());
        if(this.getStatus())
        {
            System.out.println("This account is open.");
            System.out.println("The owner of this account is Mr(s) " +this.getDono());
            if(this.getTipo().equals("cc")) System.out.println("This is a current account.");
            else System.out.println("This is a savings account");
            System.out.println("Amount of cash this account have: "+this.getSaldo());
        }
        System.out.println("This account is closed or it has problems.");
        System.out.println("********************************************");
    }
    
}
