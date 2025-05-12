import java.io.FileWriter;
import java.io.IOException;

class output {
    public static void main(String[] args) {
        String name = """
        Damodar Joshi
        20 years
        180.5 cm
        """;
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(name);
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            System.out.println("File operation completed.");
        }
    }
}
