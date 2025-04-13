import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] ans = {"scissors", "paper", "rock"};
        String user;
        String comp;

        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("Welcome to (rock, paper, scissors) game:");
        System.out.println("***********************************");
        System.out.println("***********************************");

        int play = 1;
        while (play != 0) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            user = input.next().toLowerCase();
            System.out.println("***********************************");

            if (!user.equals("rock") && !user.equals("paper") && !user.equals("scissors")) {
                System.out.println("Invalid choice...");
            } else {
                comp = ans[random.nextInt(3)];
                System.out.println("***********************************");
                System.out.println("Your choice: " + user);
                System.out.println("Computer's choice: " + comp);
                System.out.println("***********************************");

                if (
                    (user.equals("rock") && comp.equals("scissors")) ||
                    (user.equals("scissors") && comp.equals("paper")) ||
                    (user.equals("paper") && comp.equals("rock"))
                ) {
                    System.out.println("******** You Win ***********");
                } else if (user.equals(comp)) {
                    System.out.println("******** Draw ***********");
                } else {
                    System.out.println("******** You Lose **********");
                }
            }

            System.out.print("Do you want to play again (yes/no): ");
            String res = input.next().toLowerCase();
            if (res.equals("no")) {
                play = 0;
                System.out.println("Thanks for playing!");
                System.out.println("***********************************");
            }
        }

        input.close();
    }
}
