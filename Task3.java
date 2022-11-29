import java.util.*;
class CreateAccount{
    protected long u_id;
    protected String pass;
    Scanner sc = new Scanner(System.in);
    public void createAccount(){
        System.out.println("********** CREATE ACCOUNT **********");
        System.out.print("Enter the user id : ");
        u_id=sc.nextLong();
        System.out.print("Enter the password : ");
        pass=sc.next();
        System.out.println("Your account is created successfully");
        System.out.println("---------------------------------------------");
        System.out.println();

    }
}
class Login extends CreateAccount{
    protected long id;
    protected String p;
    private int count;
    public void loginAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("********** LOG IN **********");
        System.out.print("Enter the user id : ");
        id=sc.nextLong();
        System.out.print("Enter the password : ");
        p=sc.next();

        if(u_id==id && pass.equals(p)){
            System.out.println("Log in successful");
            System.out.println();
        }else{
            System.out.println("Enter correct details\n");
            System.exit(0);
        }
        System.out.println("........WELCOME........");
        System.out.println("---------------------------------------------");
    }
}
class Deposit{
    protected double d;
    protected double bal=0;
    Scanner sc = new Scanner(System.in);
    public void dpMoney(){
        System.out.println("---------------------------------------------");
        System.out.println("Enter amount to deposit");
        d=sc.nextDouble();
        bal=bal+d;
        System.out.println("Your money deposited successfully \n");
        System.out.println("---------------------------------------------");
        System.out.println();
    }
}
class Withdraw extends Deposit{
    
    protected double wd; 
    public void wdMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Enter amount to withdraw");
        wd=sc.nextDouble();
        if(wd>bal){
            System.out.println("Insufficiant balance");
            System.out.println();
        }else{
            bal=bal-wd;
            System.out.println("Amount is withdrawn successfully\n");
        }
        System.out.println("---------------------------------------------");
    }
}
class TransferMoney extends Withdraw{
    protected double t;
    public void tMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Enter account number to transfer money");
        t=sc.nextDouble();
        if(t<=bal){
            bal=bal-t;
            System.out.println("Money is transferred successfully \n");
        }else{
            System.out.println("Insufficiant balance");
            System.out.println("---------------------------------------------");
            System.out.println();
        }
        
    }
}
class CheckBalance extends TransferMoney{
    public void checkBal(){
        System.out.println("---------------------------------------------");
        System.out.println("Available balance : "+bal);
        System.out.println("---------------------------------------------");
        System.out.println();
    }
}

class TransactionHistory extends CheckBalance{
    public void history(){
        System.out.println("---------------------------------------------");
        System.out.println("Money Deposited : "+d);
        if(wd<=d){
            System.out.println("Money Withdrawn : "+wd);
        }/*else{
            System.out.println("Insufficiant balance..");
        } */       
        if(t<=d){
            System.out.println("Money Transferred : "+t);
        }/*else{
            System.out.println("Insufficiant balance..");
        }             */
        System.out.println("---------------------------------------------");
        System.out.println();
    }
}

public class Internship {
    public static void main(String args[]){
        Login obj=new Login();
        obj.createAccount();
        obj.loginAccount();
        TransactionHistory obj3=new TransactionHistory();
        Scanner sc=new Scanner(System.in);
        char ch;
        while(true){
            System.out.println("A. Deposit money");
            System.out.println("B. Withdraw money");
            System.out.println("C. Transfer money");
            System.out.println("D. Check balance");
            System.out.println("E. Transaction history");
            System.out.println("F. Exit");
            System.out.println("Enter the choice");
            ch=sc.next().charAt(0);
            ch = Character.toUpperCase(ch);
            switch(ch){
                case 'A':
                    obj3.dpMoney();
                break;
                case 'B':
                    obj3.wdMoney();
                break;
                case 'C':
                    obj3.tMoney();
                break;
                case 'D':
                    obj3.checkBal();
                break;
                case 'E':
                    obj3.history();
                break;
                case 'F':
                    System.out.println("---------------------------------------------");
                    System.out.println("Thank you for using our service..");
                    System.out.println("---------------------------------------------");
                    System.exit(ch);
                default:
                    System.out.println("Enter the correct choice");
                break;

            }
        }   
    }
}
