import java.util.Random;
class randomclass {
    public static void main(String[] args) {
     Random r = new Random();
     int number1 = r.nextInt(1,10);
     int number2 =r.nextInt(10,20);
     int number3 =r.nextInt(20,40);
     int number4 =r.nextInt(40,50);
     int number5 =r.nextInt(50,60);
     
     System.out.println(number1);
     System.out.println(number2);
     System.out.println(number3);
     System.out.println(number4);
     System.out.println(number5);
     
    boolean head = r.nextBoolean();
    if(head){
        System.out.println("Heads");
    }
    else 
    {
        System.out.println("Tails");
    }
     
}
}
