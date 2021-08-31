package vehicles;

public class Vehicles {
	String brand = "TOYOTA";
	String color = "white";
	
	Vehicles(){
	}
	
	Vehicles(String brandname, String colortype){
		brand = brandname;
		color = colortype;
	}
	
	public void run() {
		System.out.println("I am already running");
	}
	
	public void showInfo() {
		System.out.print("Brand:");
		System.out.println(brand);
		System.out.print("Color:");
		System.out.println(color);
	}

}

class Car extends Vehicles{
	int seats;
	
	Car(String brandname, String colortype, int seatnumber){
		brand = brandname;
		color = colortype;
		seats = seatnumber;
	}
	
	public void showCar() {
		System.out.print("Brand:");
		System.out.println(brand);
		System.out.print("Color:");
		System.out.println(color);
		System.out.print("Seats:");
		System.out.println(seats);
	}

}

class Truck extends Vehicles{
	float load;
	
	Truck(String brandname, String colortype, float loadnumber){
		brand = brandname;
		color = colortype;
		load = loadnumber;
	}
	
	public void showTruck() {
		System.out.print("Brand:");
		System.out.println(brand);
		System.out.print("Color:");
		System.out.println(color);
		System.out.print("Load:");
		System.out.println(load);
	}
}