
public class BMW extends AbstractCars {

	private Cars car;

	public BMW(Cars car) {
		super();
		this.car = car;

	}

	@Override
	public String typeOfFuel() {
		return "Diesel";
	}

}
