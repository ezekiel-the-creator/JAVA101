import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordSearch {
    public static void main(String... args){
        //Create a grid
        char[][] grid = new char[10][10];

        //Add words to the grid
        String[] words = {"java", "python", "html", "C++", "ruby", "rust"};
        Random rand = new Random();
        for(String word : words){
            int direction = rand.nextInt(3);
            int row = rand.nextInt(10);
            int col = rand.nextInt(10);
            for (int i = 0; i < word.length(); i++){
                if(direction == 0 && col+ i < 10){
                    grid[row][col+i] = word.charAt(i);
                }else if (direction == 1 && row+i < 10){
                    grid[row+i][col] = word.charAt(i);
                }else if (row+i < 10 && col+i < 10){
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

        //List of words to find
        List<String> wordList = Arrays.asList(words);

        try (//Allow the player to search for words
        Scanner scanner = new Scanner(System.in)) {
            int wordsFound = 0;
            while (!wordList.isEmpty() && wordsFound < wordList.size()){
                System.out.print("Enter a word to find: ");
                String word = scanner.nextLine();
                if(wordList.contains(word)){
                    System.out.println("You found the word \"" + word + "\"!");
                    wordsFound++;
                }else{
                    System.out.println("Sorry, that word is not in the puzzle.");
                }
            }
            if (wordsFound == wordList.size()){
                System.out.println("Congratulations, you found all the words!");
            }
        }
    }
}
