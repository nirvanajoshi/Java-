// Use of switchcase
import java.util.Scanner;
class daychecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day:");
        String day = input.nextLine();
        switch(day){
            case"sunday" -> System.out.println("Today is Sunday");
            case"monday" -> System.out.println("Today is Monday");
            case"tuesday" -> System.out.println("Today is Tuesday");
            case"wednesday" -> System.out.println("Today is Wednesday");
            case"thursday" -> System.out.println("Today is Thursday.");
            case"fryday" -> System.out.println("Today is Fryday.");
            case"saturday" -> System.out.println("Today is Saturday.");
            default -> System.out.println(day+" is not day.");
            
        }
       
        input.close();
        
    }
}