package student;

public class Student {
	String name;
	String age;
	String degree;
}

class Undergraduate extends Student{
	String specialty;
	public void show() {
		System.out.print("Name: ");
		System.out.println(name);
		System.out.print("Age: ");
		System.out.println(age);
		System.out.print("Degree: ");
		System.out.println(degree);
		System.out.print("Specialty: ");
		System.out.println(specialty);
	}
}

class Graduate extends Student{
	String direction;
	public void show() {
		System.out.print("Name: ");
		System.out.println(name);
		System.out.print("Age: ");
		System.out.println(age);
		System.out.print("Degree: ");
		System.out.println(degree);
		System.out.print("Direction: ");
		System.out.println(direction);
	}
}


