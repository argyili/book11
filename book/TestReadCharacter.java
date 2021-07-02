public class TestReadCharacter {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a character: ");
    String s = input.nextLine();
    char ch = s.charAt(0);
    System.out.println("The character entered is " + ch);
  }
}