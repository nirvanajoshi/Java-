// Temperature
import java.util.Scanner;

class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature you want to convert:");
        int temp = input.nextInt();
        
        System.out.println("Convert into C or F (C/F):");
        String conv = input.next().toUpperCase();
        
        double newtemp = (conv.equals("C")) ? (temp - 32) * 5.0 / 9 : (temp * 9.0 / 5) + 32;
        System.out.println("New temperature: " + newtemp + " units");
       
        input.close();
    }
}