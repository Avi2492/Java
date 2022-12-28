public class StringObjects {
    public static void main(String[] args) {
        String s1="Avinash";
        String s2="Avinash";
        if(s1 == s2) {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
        String s3 = new String("Avinash");
        if(s1 == s3) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    } 
}
