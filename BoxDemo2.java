// Box volume with the help of parameterised constructor
class Box {
    double width;
    double height;
    double depth;
     Box(double w, double h, double d) {
         width = w;
         height = h;
         depth = d;
     }
     
     double volume() {
         return width*height*depth;
     }
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        double vol;
        
        vol = b1.volume();
        System.out.println("Volume is: " + vol);
    }
}
