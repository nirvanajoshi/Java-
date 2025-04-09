import java.util.Scanner;
class scanner {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = n.nextLine();
        System.out.print("Enter your age:");
        int age = n.nextInt();
        System.out.print("Enter your height:");
        double height = n.nextDouble();    
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Height:"+height+"");
        n.close();
       
    }
}