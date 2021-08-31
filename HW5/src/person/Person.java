package person;

public class Person {
	void IntroduceSelf() {
		System.out.println("I am a person");
	}
	
}

class Student extends Person {
	void IntroduceSelf() {
		System.out.println("I am a student");
	}
}

class Employee extends Person {
	void IntroduceSelf() {
		System.out.println("I am an employee");
	}
}

class Retired extends Person {
	void IntroduceSelf() {
		System.out.println("I am retired");
	}
}
