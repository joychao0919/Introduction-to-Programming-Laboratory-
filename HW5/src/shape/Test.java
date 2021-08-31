package shape;

public class Test {
	public static void main(String[] args) {
		Circle shape1 = new Circle(3.5);
		double area1 = shape1.getArea();
		System.out.println("Circle area:" + area1);
		
		Square shape2 = new Square(3.5);
		double area2 = shape2.getArea();
		System.out.println("Square area:" + area2);
	}
}
