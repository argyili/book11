import java.util.*;

public class ArrayListvsLinkedList1 {
  public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new LinkedList<>();
	
	test(list1, "Time for ArrayList is ");
	test(list2, "Time for LinkedList is ");	
  }
  
  public static void test(List<Integer> list, String title) {
	long startTime = System.currentTimeMillis();
	
	for (int i = 0; i < 1000000; i++) {
      list.add(0, i);
	}
	
	long time = System.currentTimeMillis() - startTime;
	System.out.println(title + time + " milliseconds");
  }
}
