public class ExceptionPropagation {
    public void first() {
        int data = 20 / 0;
    }

    public void Second() {
        first();
    }

    public void Third() {
        try {
            Second();
        } catch (Exception e) {
            System.out.println("Exception is there 20/0 = undefined");
        } finally {
            System.out.println("Error is gettted");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation ob = new ExceptionPropagation();
        ob.Third();
        System.out.println("Thanks");
    }
}
