import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(String name){
        this.balance = 0;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit successful. New balance is: " + this.balance);
    }

    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Withdrawal failed. Insufficient balance.");
        }else{
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance is: " + this.balance);
        }
    }

    public void checkBalance(){
        System.out.println("Current balance is: "+ this.balance);
    }

    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            BankAccount account =new BankAccount(name);
            
            while(true){
                System.out.println("Choose an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check balance");
                System.out.println("4. Exit");

                int option = input.nextInt();

                switch(option){
                    case 1:
                        System.out.println("Enter the deposit amount: ");
                        double depositAmount = input.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount");
                        double withdrawalAmount = input.nextDouble();
                        account.withdraw(withdrawalAmount);
                        break;
                    case 3:
                        account.checkBalance();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid option");
                }
            }
        }
    }
}