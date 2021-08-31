package role;

public class Role {
	public String name;
	public String age;
	public String gender;
	
	Role(){
	}
	
	Role(String myname, String myage, String mygender){
		name = myname;
		age = myage;
		gender = mygender;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAge(){
		return age;
	}
	
	public void setAge(String age){
		this.age = age;
	}
	
	public String getGender(){
		return gender;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public void showInfo() {
		System.out.print("NAME:");
		System.out.println(name);
		System.out.print("AGE:");
		System.out.println(age);
		System.out.print("GENDER:");
		System.out.println(gender);
	}
}

class Employee extends Role{
	public double salary;
	
	Employee(String myname, String myage, String mygender, double mysalary){
		super(myname, myage, mygender);	
		salary = mysalary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void showEmployeeInfo() {
		System.out.print("NAME:");
		System.out.println(getName());
		System.out.print("AGE:");
		System.out.println(getAge());
		System.out.print("GENDER:");
		System.out.println(getGender());
		System.out.print("SALARY:");
		System.out.println(salary);
	}
}

class Manager extends Employee{
	public int teamSize;
	public String position;
	
	Manager(String myname, String myage, String mygender, double mysalary, int teamsize, String pose) {
		super(myname, myage, mygender, mysalary);
		teamSize = teamsize;
		position = pose;
	}
	
	public int getTeamSize() {
		return teamSize;
	}
	
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void showManagerInfo() {
		System.out.print("NAME:");
		System.out.println(getName());
		System.out.print("AGE:");
		System.out.println(getAge());
		System.out.print("GENDER:");
		System.out.println(getGender());
		System.out.print("SALARY:");
		System.out.println(getSalary());
		System.out.print("TEAM SIZE:");
		System.out.println(teamSize);
		System.out.print("POSITION:");
		System.out.println(position);
	}
}
