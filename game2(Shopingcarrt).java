import java.util.Scanner;
class Shopingcart {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the name of item:");
        String name = n.nextLine();
        
        System.out.print("Enter the prize of item:");
        double price = n.nextInt();
        
        System.out.print("Enter the no if items:");
        double q = n.nextInt();
         
        double total = price * q;
        
        System.out.println("Name:"+name);
        System.out.println("Price:Rs."+price);
        System.out.println("Quantity:"+q);
        System.out.println("TOTAL=Rs."+total);
        n.close();
        
    }
}