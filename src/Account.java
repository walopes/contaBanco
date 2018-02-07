
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
    
}
