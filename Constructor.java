class Student {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
//    Constructor 
    Student() {
        System.out.println("Constructor called");
    }
}

public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Avinash";
        s1.age = 22;
        
        s1.printInfo();
    }
}
