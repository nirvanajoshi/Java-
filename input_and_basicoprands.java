import java.util.Scanner;

class Operation {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int num1 = n.nextInt();

        System.out.print("Enter the second number:");
        int num2 = n.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the greater number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the greater number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double) num1 / num2; // Fixed division
        int mod = num1 % num2;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Mod: " + mod);

        n.close();
    }
}
