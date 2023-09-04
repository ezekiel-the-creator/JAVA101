import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String... args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix");
        int r = in.nextInt();
        int c = in.nextInt();
        int first[][] = new int[r][c];
        int second[][] = new int[r][c];
        int sum[][] = new int[r][c];
        int i;
        int j;

        System.out.println("Enter the elements of the first matrix");
        for(i = 0; i < r; i++){
            for (j = 0; j < c; j++){
                first[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix");
        for(i = 0; i < r; i ++){
            for (j = 0; j < c; j++){
                second[i][j] = in.nextInt();
            }
        }

        //Adding the two matrices
        for (i = 0; i < r; i ++){
            for (j = 0; j < c; j ++){
                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        System.out.println("Sum of entered matrices:-");
        for (i = 0; i < r; i ++){
            for (j = 0; j < c; j ++){
                System.out.print(sum[i][j] + "\t");
                System.out.println();
            }
        } 
    }
}
