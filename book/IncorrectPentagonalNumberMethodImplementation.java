public class IncorrectPentagonalNumberMethodImplementation {
  public static void main(String[] args) {
    System.out.println("Pentagonal Numbers: ");
    getPentagonalNumber(100);
  }

  public static int getPentagonalNumber(int n) {
    int number = 1;
    
    while (number <= 100) {     
      int pentagonalNumber = number * (3 * number - 1) / 2;
      if (number % 10 == 0) 
        System.out.println(pentagonalNumber);
      else 
        System.out.print(pentagonalNumber + " ");
      
      number++;
    }
    
    return number;
  }
}
