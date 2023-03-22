public class AssertionExample {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        assert n <= 10;
        assert n > 20 : "No. is greater than 20";
        System.out.println("pass");
    }
}