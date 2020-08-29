
/* Interface BicycleParts */

package Activity2_3;

public interface BicycleParts 
{

	public int gears = 0;
	public float currentSpeed = 0;
	
}

/* Interface BicycleOperations */

package Activity2_3;

public interface BicycleOperations {
	
	public void applyBrake(float decrement);
	public void speedUp(float increment);
	

}
/* Class Bicycle */

package Activity2_3;

public class Bicycle implements BicycleParts,BicycleOperations

{
	
	public int gears;
	public float currentSpeed;
	
	public Bicycle(int gears, float currentSpeed)
	{
		this.currentSpeed = currentSpeed;
		this.gears = gears;
	}
	
	public void applyBrake(float Descreasedspeed)
	{
		currentSpeed = currentSpeed - Descreasedspeed;
		
	}
  
	public void speedUp(float IncreasedSpeed)
	{
		currentSpeed = currentSpeed + IncreasedSpeed;
	}
	
	public String bicycleDesc()
	{
		return ("\n Current Speed is:"+currentSpeed + "\n Gears: "+gears);
	}
}

/* Class MountainBike */

package Activity2_3;

public class MountainBike extends Bicycle

   {
	public float seatHeight;
	
	public MountainBike(int gears, float currentSpeed, float seatHeight)
	{
		super(gears,currentSpeed);
		this.seatHeight = seatHeight;
	}
	
	public void setHeight(Float newSeatHright)
	{
		seatHeight = newSeatHright;
	}
	
	public String bicycleDesc()
	{
		return(super.bicycleDesc()+"\n SeatHeight:"+seatHeight);
	}

}

/*Class driver*/

package Activity2_3;

public class driver {

	public static void main(String[] args) {
		MountainBike MB = new MountainBike(5,50,15);
		System.out.println(MB.bicycleDesc());
		MB.speedUp(20);
		MB.applyBrake(4);
	}

}

