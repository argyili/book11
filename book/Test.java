public class Test {
  /** Main method */
  public static void main(String[] args) {
  	int x = 5;
    for (int i = 0; i < x; i++) {
      if (i % 2 == 0) {
        continue;
      }
      
      System.out.print(i + " ");
    }
  }

  /** Print a table of areas for radius */
  public static void printAreas(Circle c, int times) {
    System.out.println("Radius \t\tArea");
    while (times >= 1) {
      System.out.println(c.getRadius() + "\t\t" + c.getArea());
     c.setRadius(c.getRadius() + 1);
      
    }
  }
}