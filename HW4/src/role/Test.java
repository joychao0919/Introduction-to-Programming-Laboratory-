package role;

public class Test {
	public static void main(String[] args) {
		Role person1 = new Role("Lucy", "thirty", "female");
		person1.showInfo();
		System.out.println(" ");
		
		Employee person2 = new Employee("Mark", "twenty", "male", 20000);
		person2.showEmployeeInfo();
		System.out.println(" ");
		
		Manager person3 = new Manager("Wendy", "forty", "female", 40000, 20, "manager");
		person3.showManagerInfo();
		System.out.println(" ");
	}
}
