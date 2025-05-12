// Use of switchcase
import java.util.Scanner;
class vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string:");
        String c = input.next();
         if (c.equals("a") || c.equals("e") || c.equals("i")||c.equals("o")||c.equals("u")||c.equals("A") || c.equals("E") || c.equals("I")||c.equals("O")||c.equals("U")){
             System.out.println("The string is vowel");
         }
        else{
            System.out.println("The string is consonent ");
        }
        input.close();

        }
       
        
        
    }