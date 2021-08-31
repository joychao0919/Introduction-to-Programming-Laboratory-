package date;

public class Test {
	public static void main(String[] args) {
		Date d1 = new Date("1998", "9", "19");
		Date d2 = new Date(2018, "March", 15);
		Date d3 = new Date(2020, 6, 2);
		d1.print();
		d2.print();
		d3.print();
		int count1 = d1.dateDistance(d2);
		int count2 = d1.dateDistance(d3);
		int count3 = d2.dateDistance(d3);
		System.out.print("d1 and d2 distance: ");
		System.out.println(count1);
		System.out.print("d1 and d3 distance: ");
		System.out.println(count2);
		System.out.print("d2 and d3 distance: ");
		System.out.println(count3);
	}
}
