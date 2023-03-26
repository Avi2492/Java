import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> tree = new TreeSet<Integer>();
        tree.add(3);
        tree.add(1);
        tree.add(2);
        System.out.println("TreeSet: " + tree);
    }
}