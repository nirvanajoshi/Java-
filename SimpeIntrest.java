
import java.util.Scanner;
class SimpeIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle:");
        double p = input.nextDouble();
        
        System.out.print("Enter the time:");
        double t = input.nextDouble();
         
        System.out.print("Enter the rate :");
        double r =input.nextDouble(); 
        
        double interest = (p*t*r)/100;
        
        System.out.print("The intrest of Rs " + interest);
        input.close();
    }
}