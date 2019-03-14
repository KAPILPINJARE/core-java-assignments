package main;

class Vehicle
{
	private int currentSpeed;
	private int direction;
	private String ownerName;
	
	private static int HighestVehicleIdNumber = 7965845;
	private int VehicleIdNo;

	public void setCurerntSpeed(int currentSpeed)
	{
		this.currentSpeed = currentSpeed;
	}
	public int getCurrentSpeed()
	{
		return currentSpeed;
	}

	public void setDirection(int direction)
	{
		this.direction = direction;
	}
	public int getDirection()
	{
		return direction;
	}

	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}
	public int getOwnerName()
	{
		return ownerName;
	}

	public void setVehicleIdNo(int vehicleIdNo)
	{
		this.vehicleIdNo = vehicleIdNo;
	}
	public int getVehicleIdNo()
	{
		return vehicleIdNo;
	}	
}