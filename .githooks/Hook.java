import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hook {
    public static void main (String[] args) throws IOException {
        String gitMessage = readFirstLine(args[0]);
        System.out.println(gitMessage);
        if (gitMessage.startsWith("tom") || gitMessage.startsWith("gaston")) {
            System.exit(0);
        }
        System.out.println("Commit message must start with 'tom' or 'gaston'");
        System.exit(1);
    }

    public static String readFirstLine(String fileName)throws IOException
    {
        String data = "";
        data = new String(
            Files.readAllLines(Paths.get(fileName))
            .get(0));
        return data;
    }
}