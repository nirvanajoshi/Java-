import java.util.Scanner;
class banking {
    static Scanner input = new Scanner(System.in);
    static void sbalance(double balance){
        System.out.println("Rs."+balance );  
     }
      static double ddoposite(){
        System.out.print("Enter the amount to be deposite:Rs.");
       double amount = input.nextDouble();
       return amount;
       }
       static double wwithdral(){
        System.out.print("Enter the amount to be withdral:");
       double amount = input.nextDouble();
       return amount;
       }
     
    public static void main(String []args){
       // declaring variable
       double balance=1000;
       
       
       System.out.println("*****************");
       System.out.println("****LAXMI BANK***");
       System.out.println("*****************");
       System.out.println("1.Show balance");
       System.out.println("2.Deposite");
       System.out.println("3.Widthraw");
       System.out.println("4.Exit");
       System.out.println("*****************");
       System.out.println("Enter your choice:(1/4)");
       
       int choice = input.nextInt();
       
       switch(choice){
           case 1 ->{
               System.out.println("Balance");
               sbalance(balance);
           }
             case 2 ->{
               System.out.println("Deposit");
               balance = balance + ddoposite();
               System.out.println("Balance after deposit:Rs."+balance);
               
           }
             case 3 ->{
               System.out.println("Withdral");
               balance = balance - wwithdral();
               System.out.println("Balance after deposit:Rs."+balance);
           }
             case 4 ->{
               System.out.println("*****************");
               System.out.println("Exiting");
               System.out.println("*****************");
               System.out.println("Exited");
               System.out.println("*****************");
           }
           default ->{
               
               System.out.println("*****************");
               System.out.println("Invalid choice");
               System.out.println("*****************");
           }
               
           }
           
       }
       
       
    }