package student;

public class Test {
	public static void main(String[] args) {
		Undergraduate undergraduate = new Undergraduate();
		Graduate graduate = new Graduate();
		undergraduate.name = "Mary";
		undergraduate.age = "twenty";
		undergraduate.degree = "undergraduate";
		undergraduate.specialty = "Computer Science";
		undergraduate.show();
		System.out.println(" ");
		
		graduate.name = "Henry";
		graduate.age = "twenty three";
		graduate.degree = "graduate";
		graduate.direction = "Artificial Intelligence";
		graduate.show();
	}
}
