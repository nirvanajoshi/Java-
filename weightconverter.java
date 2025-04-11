
import java.util.Scanner;
class weightconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chose the Option:");
        System.out.println("1:(kg to lbs)");
        System.out.println("2:(lbs to kg)");
        int choice = input.nextInt();
        if(choice == 1){
            System.out.print("Enter the kgs to covert:");
            double kg = input.nextDouble();
            double lbs = kg*2.204;
            System.out.print("In lbs = :"+lbs);
            
        }
         else{
            System.out.print("Enter the kgs to covert:");
            double lbs = input.nextDouble();
            double kg = lbs*0.453;
            System.out.print("In kgs = :"+kg);
            
        }
        input.close();
    }
}
