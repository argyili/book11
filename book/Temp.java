import java.util.*;

public class Temp {
  public static void main(String[] args) {
//  	MyArrayList<String> list = new MyArrayList<>();
  	BST<String> list = new BST<>();
  	list.add("ABC");
  	list.add("BC");
  	list.add("CC");
  	list.add("DC");
  	list.add("EC");

  	for (String s: list)
    	System.out.print(s + " ");

  	System.out.println();
  	
  	Iterator<String> iterator = list.iterator();
  	System.out.println(iterator.next());  	
  	iterator.remove();
  	
  	System.out.println(iterator.next());
  	iterator.remove();
  	
  	System.out.println(iterator.next());
  	iterator.remove();
  	
  	for (String s: list)
    	System.out.print(s + " ");
  }
}