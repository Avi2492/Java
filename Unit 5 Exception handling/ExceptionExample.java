import java.util.*;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int z = x / y;
        System.out.println("Result: " + z);
    }
}