
public class Lexas extends AbstractCars{

	private Cars car;
	
	public Lexas(Cars car) {
		super();
		this.car= car;
		
	}

	@Override
	public String typeOfFuel() {
	
		return "Gas";
	}
	
}

