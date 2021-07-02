public class RandomDemo {
  public static void main(String[] args) {
    java.util.Random generator1 = new java.util.Random(3);
    System.out.print("From generator1: ");
    for (int i = 0; i < 10; i++)
      System.out.print(generator1.nextInt(1000) + " ");
  
    java.util.Random generator2 = new java.util.Random(3);
    System.out.print("\nFrom generator2: ");
    for (int i = 0; i < 10; i++)
      System.out.print(generator2.nextInt(1000) + " ");
  }
}
