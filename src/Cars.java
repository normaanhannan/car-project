
public class Cars {

	private String typeOfCar;
	private boolean hasGps;
	private boolean carRuns;
	private String typeOfFuel;
	
	public String getTypeOfCar() {
		return typeOfCar;
	}
		//created constructors 
	public Cars(String typeOfCar ) {
		super();
		this.typeOfCar = typeOfCar;
			
		}
		
		//created setters and getters 
	public Cars() {
		super();
	}

	public void setTypeOfCar(String typeOfCar) {
		this.typeOfCar = typeOfCar;
	}

	public boolean isHasGps() {
		return hasGps;
	}

	public void setHasGps(boolean hasGps) {
		this.hasGps = hasGps;
	}

	public boolean isCarRuns() {
		return carRuns;
	}

	public void setCarRuns(boolean carRuns) {
		this.carRuns = carRuns;
	}
	public String getTypeofFuel() {
		return typeOfFuel;
	}
	public void setTypeofFuel(String typeofFuel) {
		this.typeOfFuel = typeofFuel;
	}
}
