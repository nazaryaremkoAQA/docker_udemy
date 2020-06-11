import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String log = "output.txt";
        File file = new File(log);

        if (file.delete()) {
            System.out.println("File deleted successfully");
        }
    }
}
