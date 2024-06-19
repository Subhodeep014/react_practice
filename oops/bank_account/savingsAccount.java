package oops.bank_account;

public class savingsAccount extends account{
    private double interestRate;

    public savingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public void applyInterest(){
        balance+=balance*(interestRate/100);
    }
    
}
