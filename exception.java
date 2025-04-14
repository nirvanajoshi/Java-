import java.util.Scanner;
class exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter a number:");
            int num = input.nextInt();
            System.out.println("You entered: " + num);
        }
        catch(Exception e){
            System.out.println("You didn't Enter a number");
        }
        input.close();
    }
}
