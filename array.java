import java.util.Arrays;
import java.util.Scanner;
class array {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int n = input.nextInt();
        
        String[] names = new String[n];
        
        System.out.println("Enter the names of student:");
        
        for(int i=0;i<n;i++){
            System.out.printf("Enter the name[%d]:",i);
            names[i] = input.next();
        }
        Arrays.sort(names);// function that helps to sort array...
        
        for(String name:names){
            System.out.println(name);
        }
          input.close();  
        }
     
    }
