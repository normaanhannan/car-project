
public abstract class AbstractCars implements CarService {

	

	@Override
	public boolean hasGps() {
		
		return true;
	}

	@Override
	public boolean carRuns() {
		
		return true;
	}


	

	public void printResult() {
		
		System.out.println("Car has GPS: " + hasGps());
		System.out.println("Does the car run? :" + carRuns());
		System.out.println("Type of fuel used to operate :" + typeOfFuel());
		
	}

}
