class Myexception extends Throwable {
    public Myexception(int i) {
        System.out.println("You have entered: " + i + "it exeeding limits");
    }
}

public class OwnExceptionTest {
    public void show(int i) throws Myexception {
        if (i < 100) {
            throw new Myexception(i);
        } else {
            System.out.println(+i + "is less than 100 or its ok");
        }
    }

    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        OwnExceptionTest t = new OwnExceptionTest();
        try {
            t.show(i);
            t.show(j);
        } catch (Throwable e) {
            System.out.println("caught error: " + e);
        }
    }
}
