// Use of switchcase
import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number:");
        double num1 = input.nextInt();
        
        System.out.print("Enter a operator(+,-,*,/,^):");
        String oper = input.next();
        
        System.out.print("Enter a Second number:");
        double num2 = input.nextInt();
         
        double result=0;
        
        switch(oper){
            case"+" -> result = num1+num2;
            case"-" -> result = num1-num2;
            case"*" -> result = num1*num2;
            case"^" -> result = Math.pow(num1,num2);
            case"/" -> {
                if(num2==0){
                System.out.println("The number is not divisible by 0.");
            }
            else{
                result = num1/num2;
                
            }
                
            }
            default -> System.out.println("Invalid operation");
        }
        System.out.println("Result:" + result);
       
        input.close();
        
    }
}
