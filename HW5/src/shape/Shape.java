package shape;

public interface Shape {
	abstract double getArea();
	double PI = 3.14;
}

class Circle implements Shape {
	double r;
	double area1;
	Circle(double r) {
		this.r = r;
	}
	public double getArea() {
		area1 = r*r*PI;
		return area1;
	}
}

class Square implements Shape {
	double a;
	double area2;
	Square(double a) {
		this.a = a;
	}
	public double getArea() {
		area2 = a*a;
		return area2;
	}
}