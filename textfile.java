import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
class textfile{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String filepath="test.txt";
        String text ="""
        Damodar joshi
        20 years
        180.5 cm
        """;
        try(FileWriter writer = new FileWriter(filepath)){
            writer.write(text);
        }
        catch(IOException e){
            System.out.println("Error in file openning");
        }
        
        try(BufferedReader reader = new BufferedReader(new FileReader("test.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error in file Reading");
        }
        
    }
}