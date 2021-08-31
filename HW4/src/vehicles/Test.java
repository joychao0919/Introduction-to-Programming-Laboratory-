package vehicles;

public class Test {
	public static void main(String[] args) {
		System.out.println("Vehicle1:");
		Vehicles vehicle1 = new Vehicles();
		vehicle1.run();
		vehicle1.showInfo();
		System.out.println(" ");
		
		System.out.println("Vehicle2:");
		Vehicles vehicle2 = new Vehicles("BMW", "black");
		vehicle2.run();
		vehicle2.showInfo();
		System.out.println(" ");
		
		System.out.println("Car:");
		Car car = new Car("Audi", "silver", 4);
		car.showCar();
		System.out.println(" ");
		
		System.out.println("Truck:");
		Truck truck = new Truck("Honda", "blue", 500.5F);
		truck.showTruck();
		System.out.println(" ");
	}
}
