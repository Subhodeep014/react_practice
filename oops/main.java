package oops;

import oops.bank_account.savingsAccount;

public class main {
    public static void main(String[] args) {
        student s1 = new student("Subhodeep", 23, "ce32424");

        s1.display();
        employee e = new employee("Subhodeep", 23, 15000);
        e.setSalary(15000);
        double salary =  e.getSalary();

        circle c = new circle(2, "yellow");
        System.out.println(c.getColor());
        System.out.println(salary);

        savingsAccount account = new savingsAccount(160000, 10);
        System.out.println(account.getBalance());
        account.deposit(2000);
        System.out.println(account.getBalance());
        account.applyInterest();
        System.out.println(account.getBalance());
    }
}
