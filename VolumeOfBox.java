class Box {
  double width;
  double height;
  double depth;

  double volume() {
    return width*height*depth;
  }
}

class VolumeOfBox {
  public static void main(String[] args) {
    Box b1 = new Box();
    double vol;
    b1.width = 30;
    b1.height = 10;
    b1.depth = 15;
    vol = b1.volume();
    System.out.println("Volume is: " + vol);
  }
}
