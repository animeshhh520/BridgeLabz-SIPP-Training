package OOPS_Concept.Level2;

public class BankAccount{
    private String accountHolder;
    private  long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void Deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("₹%.2f deposited successfully.\n", amount);
        }
        else{
            System.out.println("Invalid Deposit amount");
        }
    }
    public void Withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid amount");
        }
        else if(amount<=balance){
            balance-=amount;
            System.out.printf("%.2f INR withdrawn successfully.\n",amount);
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
    public void DisplayBalance(){
        System.out.printf("Current Balance: %.2f\n",balance);
    }
    public void DisplayAccountInfo(){
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        DisplayBalance();
    }
    
}