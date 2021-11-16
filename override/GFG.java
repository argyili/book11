import java.util.*;

// implementing Comparable interface
public class GFG implements Comparable<GFG> {

	String name;
	int age;

	// Class constructor
	GFG(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public int getage() { return age; }
	public String getname() { return name; }

	public static void main(String[] args)
	{
		// Creating GFG class object
		GFG ob[] = new GFG[4];

		// Inserting elements in the objects
		ob[0] = new GFG("Aayush", 14);
		ob[1] = new GFG("Ravi", 12);
		ob[2] = new GFG("Sachin", 19);
		ob[3] = new GFG("Mohit", 20);

		// sort the array,using overriden method
		Arrays.sort(ob);

		for (GFG o : ob) {
			System.out.println(o.name + " " + o.age);
		}

		ArrayList<GFG> objects = new ArrayList<>();

		GFG newObject1 = new GFG("Rohan Devaki", 20);
		objects.add(newObject1);

		GFG newObject2 = new GFG("Algorithammer", 22);
		objects.add(newObject2);

		Collections.sort(objects);

		for (GFG o : objects) {
			System.out.format("%s %d\n", o.name, o.age);
		}
	}
	// Overriding compareTo() method
	@Override
	public int compareTo(GFG o)
	{
		if (this.age > o.age) {
			return 1;
		}
		else if (this.age < o.age) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
