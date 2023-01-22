package vehicalpackage;

public class ElectricVehicle extends Vehicle {
	
	
	private int batteryCapacity ;
	private int chargeLevel ;
	
	
	public void charge(int charge )
	{
		chargeLevel = chargeLevel + charge ;
		if(chargeLevel >= 100)
		{
			chargeLevel=100;
		    System.out.println("the charge level is "+chargeLevel);
		}
		else
		{
			System.out.println("the charge level is "+chargeLevel);	
		}
	}


	public void drive(int miles)
	{
		System.out.println("ElectricVehicle driven "+ miles+" miles");
	}
	
	
	
	
	
	
	
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}


	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}


	public int getChargeLevel() {
		return chargeLevel;
	}


	public void setChargeLevel(int chargeLevel) {
		this.chargeLevel = chargeLevel;
	}
	

}
