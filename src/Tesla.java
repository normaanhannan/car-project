
public class Tesla extends AbstractCars {

	private Cars car;
	
	public Tesla(Cars car) {
		super();
		this.car=car;
		
	}

	@Override
	public String typeOfFuel() {
		
		return "Electric";
	}
}
