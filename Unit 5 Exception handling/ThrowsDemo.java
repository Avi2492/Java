import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsDemo {
    public static void main(String[] args) throws IOException {
        char i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter char, 'q' to quit ");
        do {
            i = (char) br.read();
            System.out.println(i);
        } while (i != 'q');
    }
}
