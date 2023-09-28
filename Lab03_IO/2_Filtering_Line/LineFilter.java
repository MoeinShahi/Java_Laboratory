import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineFilter {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java LineFilter <pattern>");
            System.exit(1);
        }

        String pattern = args[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.matches(pattern)) {
                    System.out.println(line);
                }
            }
        } finally {
            reader.close();
        }
    }
}
