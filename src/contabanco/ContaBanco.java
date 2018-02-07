/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

/**
 *
 * @author walopes
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account Corrente = new Account();
        Corrente.show();
        Corrente.abrirConta("cc",4899);
        Corrente.setDono("Marcão");       
        
        Corrente.show();
        Corrente.depositarConta(120);
        Corrente.pagarMensalidade();
        Corrente.show();
        
    }
    
}
