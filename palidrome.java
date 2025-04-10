//PALIDROME 
import java.util.Scanner;
class palidrome{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the numer you want to check:");
        int num = n.nextInt();
        int next = num;
        int rem;
        int result=0;
        while(next!=0){
         rem=next%10;
         result=result*10+rem;
         next=next/10;
        }
        if(num == result){
            System.out.println("The given number is palidrome.");
        }
        else{
            System.out.println("The given number is not palidrome.");
             }
             n.close();
}  
    
}