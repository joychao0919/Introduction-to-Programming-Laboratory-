package triangle;

public class Test {
	public static void main(String[] args) {
		try {
			new Triangle(2, 5, 8).getArea();
		}
		catch(NotTriangleException wie) {
			System.out.println(wie.getMessage());
		}
		
		try {
			new Triangle(2, 5, 8).showInfo();
		}
		catch(NotTriangleException wie) {
			System.out.println(wie.getMessage());
		}
		
		try {
			new Triangle(2, 2, 2).getArea();
		}
		catch(NotTriangleException wie) {
			System.out.println(wie.getMessage());
		}
		
		try {
			new Triangle(2, 2, 2).showInfo();
		}
		catch(NotTriangleException wie) {
			System.out.println(wie.getMessage());
		}
	}
}
