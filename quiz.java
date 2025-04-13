import java.util.Scanner;
class quiz{
    // program to print number dail
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     //Quetions
     String[] qns ={
          "What is the function of ROM?",
          "What is the brain of Computer?",
          "Who is the the father of Computer? ",
          "When was Facce book launched?",
          "What is the first programming language?",
          };
    String[] ans ={"storage","cpu","charles babbage","2004","c"};
    String[] result = new String[5];
           for(int i =0;i<5;i++){
               System.out.println(qns[i]);
               result[i]=input.nextLine();
              
           }
           
    int corr = 0;
      for(int i =0;i<5;i++){
         if(result[i].equalsIgnoreCase(ans[i])){
             corr++;
         }
         
      }
      
      System.out.println("Correct answer:"+corr);
      input.close();
               
        }
     
    }
