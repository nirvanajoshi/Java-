// Temperature converter
import java.util.Scanner;
class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature you wanr to convert:");
        int temp = input.nextInt();
        
        System.out.println("Convert into C or F(C/F):");
        String conv = input.next().toUperCase();
        
        
        double newtemp = (conv.equals("c"))?(temp-32)*5/9:(temp*5/9)+32;
        System.out.println("New temperatere "+newtemp+" units");
       
        input.close();
        
    }
}
