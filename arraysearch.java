// Java program to search an element in an array
import java.util.Scanner;
class arraysearch{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers={2,3,5,7,9,11,13,17,21,31,37}; 
        System.out.println("Enter the number you want to search:");
        int search = input.nextInt();
        boolean found = true;
        
        for(int number:numbers){
           if(search == number) {
               break;
           }
           else{
               found = false;
           }
        }if(found){
            System.out.println("The number is found in array.");
        }
        else{
            System.out.println("The number is not found in array.");
        }
          input.close();  
        }
     
    }
