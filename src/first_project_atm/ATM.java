
package first_project_atm;

import java.util.ArrayList;

/**
 *
 * @author Rasel
 */
public class ATM implements ATMOP {
    
    private double balance;
    private ArrayList<String> history;
    
    public ATM(double initialize){
    balance=initialize;
    this.history=new ArrayList<>();   
    }
    @Override
    public void check_balance(){
        System.out.println("Current balance:"+balance);
    }
    @Override
    public void diposit(double amount){
    if(amount >0){
        balance=balance+amount;
        history.add("Deposit amount: "+amount);
        System.out.println("Deposit Amount: "+amount);
    }else{
        System.out.println("Invalid deposit amount!");      
    }
    
    }
    @Override
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
        balance=balance-amount;
        history.add("Withdraw amount: "+amount);
            System.out.println("Withdraw amount: "+amount);
        }else{
            System.out.println("Invalid withdraw amount!");
        }
    
    }
    @Override
    public void transaction_history(){
        System.out.println("Transaction history: ");
        
        for(String record : history){
            System.out.println(record);
        }
    }
}
