public class TestScannerNext {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in); 
    System.out.print("Enter three words separated by spaces: "); 
    String s1 = input.next(); 
    String s2 = input.next(); 
    String s3 = input.next(); 
    System.out.println("s1 is " + s1); 
    System.out.println("s2 is " + s2); 
    System.out.println("s3 is " + s3);
  }
}