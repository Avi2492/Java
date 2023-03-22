public class UncaughtExceptionExample {
    public static void main(String[] args) {
        int d = 0;
        int x = 42 / d;
        System.out.println(x);
    }
}
/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at UncaughtExceptionExample.main(UncaughtExceptionExample.java:4)
 */