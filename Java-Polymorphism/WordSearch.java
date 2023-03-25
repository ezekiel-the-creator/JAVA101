import java.util.Random;

public class WordSearch {
    public static void main(String... args){
        //Create a grid
        char[][] grid = new char[10][10];

        //Add words to the grid
        String[] words = {"java", "python", "Solidity", "Csharp", "ruby"};
        Random rand = new Random();
        for(String word : words){
            int direction = rand.nextInt(3);
            int row = rand.nextInt(10);
            int col = rand.nextInt(10);
            for (int i = 0; i < word.length(); i++){
                if(direction == 0){
                    grid[row][col+i] = word.charAt(i);
                }else if (direction == 1){
                    grid[row+i][col] = word.charAt(i);
                }else{
                    grid[row+i][col+i] = word.charAt(i);
                }
            }
        }
        
        //Fill the remaining cells
        for (int i = 0; i < 10; i++){
            for (int j =0; j < 10; j++){
                if (grid[i][j] == 0){
                    grid[i][j] = (char)(rand.nextInt(26) + 'a');
                }
            }
        }

        //Display the grid
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
