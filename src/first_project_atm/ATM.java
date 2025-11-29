
package first_project_atm;

import java.util.ArrayList;

/**
 *
 * @author Rasel
 */
public class ATM implements ATMOP {
    
    private double balance;
    private double totalDepositAmount=0;
    private double totalWithdrawAmount=0;
    ArrayList<String> history=new ArrayList<>();
    
    public ATM(double initialize){
    balance=initialize;      
    }
    @Override
    public void check_balance(){
        System.out.println("Current balance:"+balance);
    }
    @Override
    public void diposit(double amount){
        double maxDeposit=20000;
        if(amount <=0){
        System.out.println("Invalid deposit amount!");      
        }else if((amount+totalDepositAmount)<=maxDeposit){
        balance=balance+amount;
        totalDepositAmount=totalDepositAmount+amount;
        history.add("Deposit amount: "+amount);
        System.out.println("Deposit Amount: "+amount);  
        }else{
        System.out.println("Upto deposit amount limit");
        }   
    }
    
    @Override
    public void withdraw(double amount){
        double maxWithdraw=15000;
        if(amount<=0){
            System.out.println("Invalid deposit amount");
        
        }else if((amount+totalWithdrawAmount)<=maxWithdraw){
        balance=balance-amount;
        totalWithdrawAmount=totalWithdrawAmount+amount;                    
        history.add("Withdraw amount: "+amount);
        System.out.println("Withdraw amount: "+amount);       
        }else{
        System.out.println("upto withdraw amount limit!");
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
