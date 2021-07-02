
public class TestHouse {
  public static void main(String[] args) {
    House house1 = new House(1, 1750.0);
    house1.getWhenBuilt().setTime(3434343434L);
    House house2 = (House) (house1.clone());
    
    System.out.println("house1: " + house1.getId() + " " + house1.getArea() + " " + house1.getWhenBuilt());
    System.out.println("house2: " + house2.getId() + " " + house2.getArea() + " " + house2.getWhenBuilt());
  }
}
