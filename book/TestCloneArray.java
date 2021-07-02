public class TestCloneArray {
  public static void main(String[] args) {
    int[] list1 = {1, 2};
    int[] list2 = list1.clone();
    list1[0] = 7; 
    list2[1] = 8;
    System.out.println("list1 is " + list1[0] + ", " + list1[1]); 
    System.out.println("list2 is " + list2[0] + ", " + list2[1]); 
  }
}
