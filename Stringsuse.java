import java.util.Scanner;
class Stringsuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Email:");
        String email = input.nextLine();
        
        int length = email.length();
        String upper = email.toUpperCase();
        String lower = email.toLowerCase();
        char c = email.charAt(1);
        String r = email.replace('a','b');
        String name = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));
        
        System.out.println("Length of email:"+length);
        System.out.println("Uppercase email:"+upper);
        System.out.println("lowercase email:"+lower);
        System.out.println("A Character of email:"+c);
        System.out.println("Replacing a with b:"+r);
        System.out.println("Name:"+name);
        System.out.println("Domain:"+domain);
        
        if(email.contains("a")){
            System.out.println("This gmail contain a");
        }
        else {
            System.out.println("This gmail doesn't contain a");
        }
        input.close();
    }
}
