import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = n.nextLine();
        
        System.out.print("Enter Your Age:");
        int age = n.nextInt();
        
        System.out.print("Enter your marks:");
        double marks = n.nextDouble();
        
        System.out.print("Passer(true/false):");
        boolean pass = n.nextBoolean();
        
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
        
        if(pass){
            System.out.print("You are Passed");
        }
        else{
            System.out.print("You are not Passed");
        }
        n.close();
       
    }
}