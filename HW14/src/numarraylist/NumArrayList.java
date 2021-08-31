package numarraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class NumArrayList {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList array = new ArrayList();
		for(int i=0; i<20; i++) {
			array.add(i, r.nextInt(1001));
		}
		
		Iterator iter1 = array.iterator();
		while(iter1.hasNext()) {
			if((int)iter1.next()<500) {
				iter1.remove();
			}
		}
		
		Iterator iter2 = array.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
	}
}
