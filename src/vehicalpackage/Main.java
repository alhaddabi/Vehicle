package vehicalpackage;


public class Main {

	public static void main(String[] args) {

		Vehicle  v = new Vehicle();
		v.drive(150);// this have been ignord because the same mathod have been written in another new class
		v.honk();
		
		ElectricVehicle ev = new ElectricVehicle();
		ev.drive(20);
		
		
		Car c = new Car();
		c.openTrunk();
		
		Truck t = new Truck();
		t.load(50);
		
		
	}

}

