import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Temp\\teste PV\\11.txt"));
        String pattern = "\\s+";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);
        int i;
        ArrayList<String> list = new ArrayList<String>();

        boolean a = true;
        PrintWriter out = new PrintWriter(new PrintWriter("C:\\Temp\\teste PV\\Output.txt"), a);

        try {
            String line = br.readLine();

            while (line != null) {
                Matcher m = r.matcher(line);

                if (m.find()) {
                    String temp;
                    temp = line.substring(1, line.length() - 1);
                    list.add(temp);
                }
                else {
                    // do nothing
                }

                line = br.readLine();
            }
        }
        finally {
            br.close();
        }

        for (i = 0; i < list.size(); i++) {
            out.println(list.get(i));
        }

        out.flush();
        out.close();
    }
}