import java.util.Scanner;
import java.util.Random;
class rockpapersisor{
    // program to print number dail
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
     //Quetions

    String[] ans ={"sissor","paper","rock"};
    String user;
    String comp;
    System.out.println("***********************************");
    System.out.println("***********************************");
    System.out.println("Welcome to (rock,paper,sissor)game:");
    System.out.println("***********************************");
    System.out.println("***********************************");
    
    int play=1;
    while (play!=0){
    System.out.println("Enter you choice(rock,paper,sissor):");
    user = input.next();
    System.out.println("***********************************");
    if(!user.equals("rock")&&!user.equals("paper")&&!user.equals("sissor")){
        System.out.println("Invalid choice.....");
    }
    else{
    comp=ans[random.nextInt(3)];
    System.out.println("***********************************");
    System.out.println("Your choise:"+user);
    System.out.println("Computer choise:"+comp);
    System.out.println("***********************************");
    
    
    if((user.equals("rock")&&comp.equals("sissor"))||
    (user.equals("sissor")&&comp.equals("rock"))||
    (user.equals("sissor")&&comp.equals("paper"))){
        System.out.println("******** You Win ***********");
    }
    else{
        System.out.println("******** You lose **********");
    }
    System.out.print("Do you want to play again(yes/no):");
    String res = input.next();
    if (res.equals("no")){
        play=0;
        System.out.println("Thanks for playing");
        System.out.println("***********************************");
    }
    
    
    }
    
    
     }
     input.close();
    }
     
    }
