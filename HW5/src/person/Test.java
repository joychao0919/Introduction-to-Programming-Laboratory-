package person;

public class Test {
	public static void main(String[] args) {
		System.out.println("Normal Way:");
		Person person1 = new Person();
		person1.IntroduceSelf();
		
		Student person2 = new Student();
		person2.IntroduceSelf();
		
		Employee person3 = new Employee();
		person3.IntroduceSelf();
		
		Retired person4 = new Retired();
		person4.IntroduceSelf();
		
		System.out.println("String Way:");
		Person[] thePersons = new Person[4];
		thePersons[0] = new Person();
		thePersons[1] = new Student();
		thePersons[2] = new Employee();
		thePersons[3] = new Retired();
		for(int i=0; i<4; i++) {
			thePersons[i].IntroduceSelf();
		}
		
		System.out.println("Variable Way:");
		Person test1 = new Person();
		Student test2 = new Student();
		Employee test3 = new Employee();
		Retired test4 = new Retired();
		Introduce(test1);
		Introduce(test2);
		Introduce(test3);
		Introduce(test4);
	}

	static void Introduce(Person a) {
		a.IntroduceSelf();
	}

}
