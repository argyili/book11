import java.util.*;

public class ListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(3); list1.add(4); list1.add(2);
    System.out.println("Maximum value is list1: " + max(list1));

    LinkedList<Integer> list2 = new LinkedList<>();
    list2.add(13); list2.add(40); list2.add(12);
    System.out.println("Maximum value is list2: " + max(list2));
  }
  
  public static Integer max(List<Integer> list) {
    Integer max = list.get(0);
    for (int k = 1; k < list.size(); k++)
      if (max < list.get(k))
        max = list.get(k);
    return max;
  }
}
