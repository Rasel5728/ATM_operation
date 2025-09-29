

package first_project_atm;

import java.util.Scanner;

/**
 *
 * @author Rasel
 */
public class ATMSystem {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
       
       User_Access obj1=new User_Access();
       obj1.setUsername("rasel");
       obj1.setPassword("rasel28");
              
        ATMOP obj2=new ATM(2000);
        
        System.out.print("Enter your useranme:");
        String user=input.nextLine();
        System.out.print("Enter your password: ");
        String pass=input.nextLine();
        
        if(obj1.getUsername().equals(user) && obj1.getPassword().equals(pass)){
            System.out.println("Welcome "+obj1.getUsername());
            
            boolean y=true;
        while(y){
        System.out.println("\"1. Deposit\"\n" +
"\"2. Withdraw\"\n"+"\"3. Transaction history\"\n" +"\"4. Reset password\"\n" +"\"5. Exit\"\n");
        int x=input.nextInt();
        
        boolean exp=false;
        if(x>5 || x<=0){
        exp=true;
        }
        while(exp){
            System.out.println("Invalid number!");
            
            System.out.println("\"1. Deposit\"\n" +
"\"2. Withdraw\"\n"+"\"3. Transaction history\"\n" +"\"4. +\"\\\"Reset Password\"\n" +"\"5. Exit\"\n");
            x=input.nextInt();
            if(x<=5){
            exp=false;
            }
        }
        
        
        if(x==1){
            System.out.print("Enter your deposit amount: ");
            double depositamount=input.nextDouble();
            obj2.diposit(depositamount);
            obj2.check_balance();
            
        }else if(x==2){
            System.out.println("Enter your withdraw amount: ");
            double withdrawamount=input.nextDouble();
            obj2.withdraw(withdrawamount);
            obj2.check_balance();
            
        }else if(x==3){
        obj2.transaction_history();
        
        }else if(x==4){
            System.out.print("Enter your old password: ");
            input.nextLine();
            String old=input.nextLine();
            if(obj1.getPassword().equals(old)){
                System.out.println("Password match");
                System.out.print("Enter your new Password: ");
                String newpass=input.nextLine();
                obj1.resetpassword(newpass);
            }else{
                System.out.println("Password not match");
            }
                                                                                         
        }else if(x==5){
        y=false;
        }
        }
        System.out.println("Thanks for your Transaction");
        }else{
            System.out.println("Invalid username and password!");
        }
        
        
    }
    
}
