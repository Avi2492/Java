public class NestedTryBlocks {
    public static void main(String args[]) {
        try {
            int a = Integer.parseInt(args[0]);
            try {
                int b = Integer.parseInt(args[1]);
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("divide by zero error!");
            }

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Need 2 parameters");
        }

    }
}

// Need 2 parameters