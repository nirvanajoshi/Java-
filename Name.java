import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your fitst name: ");
        String name = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println(name+" "+lastName);
        input.close();
    }
    
}
