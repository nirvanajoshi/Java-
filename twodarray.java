import java.util.Scanner;
class twodarray{
    // program to print number dail
    public static void main(String[] args) {
        char dail[][]={ 
                         {'1','2','3'},
                         {'4','5','6'},
                         {'7','8','9'},
                         {'*','0','#'},
                            };
                           
          for(char[] row:dail){
              for(char col:row){
               System.out.print(col+"    ");   
              }
              System.out.println();
          }      
        }
     
    }
