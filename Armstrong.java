import java.util.Scanner;

public class Armstrong {
    public static void main(String... args){
        int n, sum = 0, temp, remainder, digits = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Input a number to check if it is an Armstrong number");
        n = input.nextInt();
        temp = n;
        
        //Count the number of digits
        while(temp != 0){
            remainder = temp%10;
            digits++;
            sum = sum + power(remainder, digits);
            temp = temp/10;
        }

        if(n == sum){
            System.out.println(n + " is an Armstrong number.");
        }else{
            System.out.println(n +" is not an Armstrong number");
        }
    }
}
