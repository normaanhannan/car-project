
public enum CarName {

	BMW("bmw"),LEXAS("lexas"),TESLA("tesla"), INVALID("");
	
	private String carName;

	

	private CarName (String carName) {
		this.carName = carName; 
	}
	public static CarName fromValue(String carName) {
		CarName[] carNames = CarName.values();
		
		for(CarName enumCar :carNames){
			if (enumCar.carName.equalsIgnoreCase(carName)){
				return enumCar;
			}
		}
		return INVALID;
		
	}
}
