package Activity2_2;

public class EncapsulationActivity {

	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		plane.onboard("Happy");
		plane.onboard("Lucky");
		plane.onboard("Vinny");
		plane.onboard("Bonty");
		plane.onboard("Rinku");
	
		System.out.println("Flight took off at :" + plane.takeOff());
		System.out.println("PassengerList : "+plane.getPassesngers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Flight Landed at : " + plane.getLastTimeLanded());
		System.out.println("Passengers in flight after landing:"+plane.getPassesngers());
	}

}
