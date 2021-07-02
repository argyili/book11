import java.util.Comparator;

public class TestComparatorUsingLambda {
  public static void main(String[] args) {
    GeometricObject g1 = new Rectangle(5, 5);
    GeometricObject g2 = new Circle(5);

    GeometricObject g = 
      max(g1, g2, (o1, o2) -> o1.getArea() > o2.getArea() ? 
        1 : o1.getArea() == o2.getArea() ? 0 : -1);
    
    System.out.println("The area of the larger object is " + 
      g.getArea());
  }
  
  public static GeometricObject max(GeometricObject g1, 
      GeometricObject g2, Comparator<GeometricObject> c) {
    if (c.compare(g1, g2) > 0)
      return g1;
    else
      return g2;
  }
}