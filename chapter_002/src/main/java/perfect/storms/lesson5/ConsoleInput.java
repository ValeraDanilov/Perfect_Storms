package perfect.storms.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput implements Input {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String askStr(String question) throws IOException {
        System.out.println(question);
        return reader.readLine();
    }
}
