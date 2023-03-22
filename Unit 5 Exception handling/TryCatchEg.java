
public class TryCatchEg {
    public static void main(String arr[]) {
        try {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Second number must be zero");
        } catch (NumberFormatException n) {
            System.out.println("Arguments must be numeric");
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Invalid number of arguments");
        }
    }
}

// Invalid number of arguments