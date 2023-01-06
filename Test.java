import java.io.*;
import java.util.*;

class Complex {
  int real, imag;
  
//   Calling that print function
  void print() {
    System.out.println(real + "+i" + imag);
  }
  
//   Making constructor of that complex class
  Complex(int r, int i) {
    real = r;
    imag = i;
  }
  
//   Finally calling the add function to add values
  void add(Complex c) {
    real = real + c.real;
    imag = imag + c.imag;
  }
}
class Test {
  public static void main(String[] args) {
    Complex c1=new Complex(10, 20);
    c1.print();
    Complex c2=new Complex(10, 20);
    c1.add(c2);
    c1.print();
  }
}
