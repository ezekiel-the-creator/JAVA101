package main.java.com.jvcode.app;

//Encapsulation is the process of hiding the internal implementation details of a class and exposing only the neccessary information

//Example

public class BankAccount{
    private double balance;

    public static void main( String[] args )
    {
        System.out.println( "BANK ACCOUNT" );
        BankAccount();
        deposit();
        withdraw();
    }

    public BankAccount(double balance){
        this.balance = balance;
    }

    //getter method to access the balance
    public double getBalance(){
        return balance;
    }
    //method for depositing
    public void deposit(double amount){
        balance += amount;
    }
    //method for withdrawing
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds");
        }else {
            balance -= amount;
        }
    }
}
