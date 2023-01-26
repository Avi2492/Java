// Box volume with the help of constructor
class Box {
    double width;
    double height;
    double depth;
     Box() {
         width = 10;
         height = 10;
         depth = 10;
     }
     
     double volume() {
         return width*height*depth;
     }
}

class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        double vol;
        
        vol = b1.volume();
        System.out.println("Volume is: " + vol);
    }
}
