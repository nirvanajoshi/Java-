import java.util.Scanner;
class game{
    public static void main(String[] args){
        Scanner na = new Scanner(System.in);
        System.out.println("Welcome to this game");

        System.out.print("Enter your name:");
        String name = na.nextLine();
         
        System.out.print("Enter a noun:");
        String noun = na.nextLine();
         
        System.out.print("Enter a verb:");
        String verb = na.nextLine();

        System.out.print("Enter an Game:");
        String game = na.nextLine();

        System.out.println("Once upon a time, there was a " + noun + " who loved to " + verb + ". One day, they decided to play " + game + " and had the time of their life. The end.");
        System.out.println("Thank you for playing, " + name + "! I hope you enjoyed the game.");
        na.close();

    }
}
