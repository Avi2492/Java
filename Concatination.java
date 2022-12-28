import java.io.*;

public class Concatination {
    public static void main(String[] args) {
        String s1 = "Avinash";
        String s2 = s1;
        s1 = s1 + " Pandey"; //s1=s1.concat("Pandey");
        System.out.println(s1);
        System.out.println(s1==s2);
    }
}
