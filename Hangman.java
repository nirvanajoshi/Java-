import java.util.Scanner;
import java.util.ArrayList;

class Hangman {
    public static void main(String[] args) {
    
        String word = "watermelon";
        Scanner input = new Scanner(System.in);
        
        ArrayList<Character> wordstate = new ArrayList<>();
        int wrong = 0;
        
        for (int i = 0; i < word.length(); i++) {
            wordstate.add('_');
        }
        
        System.out.println("***************************");
        System.out.println("..Welcome to Java Hangman..");
        System.out.println("***************************");
        
        while (wrong < 6) {
            System.out.print("Word: ");
            for (char c : wordstate) {
                System.out.print(c + " ");
            }
            System.out.println();
            
            System.out.println(hangmanart(wrong));
            
            System.out.print("Guess the letter: ");
            char guess = input.next().toLowerCase().charAt(0);
            
            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct!");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordstate.set(i, guess);
                    }
                }
            } else {
                System.out.println("Wrong guess....");
                wrong++;
            }
            
            // Check if player has guessed all letters
            if (!wordstate.contains('_')) {
                System.out.println("You guessed the word: " + word);
                System.out.println("You win!");
                break;
            }
        }
        
        if (wrong == 6) {
            System.out.println(hangmanart(wrong));
            System.out.println("Game over! The word was: " + word);
        }
        
        input.close();
    }
    
    static String hangmanart(int wrong) {
        return switch (wrong) {
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                     o
                    
                    
                    """;
            case 2 -> """
                     o
                     |
                    
                    """;
            case 3 -> """
                     o
                    /|
                    
                    """;
            case 4 -> """
                     o
                    /|\\
                    
                    """;
            case 5 -> """
                     o
                    /|\\
                    /
                    """;
            case 6 -> """
                     o
                    /|\\
                    / \\
                    """;
            default -> "";
        };
    }
}
