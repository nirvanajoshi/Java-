import java.util.Scanner;
class conditionali {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        
        System.out.print("Enter your age:");
        int age = n.nextInt();
        
        if(age < 18 && age > 0){
         System.out.println("You are still a child.");   
        }
        else if(age < 60 && age >=18){
         System.out.println("You are adult.");   
        }
        else{
            System.out.println("You are old citizen now.");
        }
        
      n.close();
        
    }
}
