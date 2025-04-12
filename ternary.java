// Ternary operator
import java.util.Scanner;
class ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number you wanr to check:");
        int num = input.nextInt();
        
        String result = (num%2==0)?"Even number":"Odd number";
        System.out.println(result);
        
        input.close();
        
    }
}
