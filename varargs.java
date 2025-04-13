import java.util.Scanner;
class varargs{
    // alows us to use multiple variables in methods once(varargs)
    static int sum(int... numbers){
        int sum =0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum:"+sum(1,2,3,4,5));
        }
     
    }
