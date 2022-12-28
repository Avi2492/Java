//Enter two cities and check it is in alphabatical order or not

import java.util.*;

public class CitiesName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first city name: ");
        String c1 = sc.nextLine(); //Taking First City Input
        System.out.print("Enter your Second city name: ");
        String c2 = sc.nextLine(); //Taking Second City Input
        
        //Compare the string in dictionary order
        int res = c1.compareTo(c2);
        System.out.println("The result of c1 compareTo c2: " + res);
        
        //Logic to check wheather it is alphabatical order or not
        if(res < 0) {
            System.out.println("The city is alphabatical order in: " + c1 + " " + c2);
        }
        else {
            System.out.println("The city is alphabatical order in: " + c2 + " " + c1);
        }
    }
}
