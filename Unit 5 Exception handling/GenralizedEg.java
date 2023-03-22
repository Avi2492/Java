public class GenralizedEg {
    public static void main(String args[]) {
        try {
            int a1 = Integer.parseInt(args[0]);
            int a2 = Integer.parseInt(args[1]);
            int b1 = a1 / a2;
            System.out.println(b1);
        } catch (Throwable e) {
            System.out.println(e);
        }
    }
}
// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0