package numtreeset;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class NumTreeSet {
	public static void main(String[] args) {
		Random r = new Random();
		Set<Integer>numbers = new TreeSet<Integer>();
		for(int i=0; i<80; i++) {
			numbers.add(r.nextInt(101));
		}
		System.out.println("How many different numbers:");
		System.out.println(numbers.size());
		System.out.println("List all numbers:");
		for(Integer number : numbers) {
			System.out.println(number);
		}
	}
}
