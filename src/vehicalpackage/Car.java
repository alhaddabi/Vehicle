package vehicalpackage;
public class Car extends Vehicle {
	
	
	private int numberOfDoors ;
	
	
	public void openTrunk()
	{
		System.out.println("Trunk opened");
	}


	public int getNumberOfDoors() {
		return numberOfDoors;
	}


	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	

}
