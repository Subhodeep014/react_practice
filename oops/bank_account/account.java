package oops.bank_account;

abstract public class account {
    protected double balance;
    public account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

}
