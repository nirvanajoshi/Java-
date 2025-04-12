import java.util.Scanner;
import java.util.Random;
class diceroll {
    static void rolldic(int num){
        String dice1="""
                    -------
                   |       |
                   |   *   |
                   |       |
                    -------
                     """;
          String dice2="""
                    -------
                   |*     |
                   |      |
                   |     *|
                    ------
                     """;
          String dice3="""
                    -------
                   |*      |
                   |   *   |
                   |      *|
                    -------
                     """;
          String dice4="""
                    -------
                   |*     *|
                   |       |
                   |*     *|
                    -------
                     """;
          String dice5="""
                    -------
                   |*     *|
                   |   *   |
                   |*     *|
                    -------
                     """;
          String dice6="""
                    -------
                   |*  *  *|
                   |*  *  *|
                   |*  *  *|
                    -------
                     """;
        switch (num){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter the number of dice to roll:");
        int num = input.nextInt();
        
        if(num > 0){
           System.out.println("You rool the dice."); 
           for (int i=0;i<num;i++){
               int roll =random.nextInt(1,7);
               System.out.println("You rolled:"+roll);
               rolldic(roll);
           }
        }
        else{
            System.out.print("Invalid number....");
        }
        input.close();
        
    }
}
