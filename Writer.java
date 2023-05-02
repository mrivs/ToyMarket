import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static boolean Write(String text) {
        
        try (FileWriter writer = new FileWriter("prizes.txt")) {
            writer.write(text);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
