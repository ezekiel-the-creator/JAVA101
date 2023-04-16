import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String... args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            double a = input.nextDouble();

            System.out.println("Enter the second number: ");
            double b = input.nextDouble();

            double c = a + b;

            double percentage_dominance_a = (a / c) * 100; 

            System.out.println(a + " + " + b + " = " + c);
            System.out.println("percentage dominance of a is" + percentage_dominance_a + "%");
        }
    }
}
