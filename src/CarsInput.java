import java.util.Scanner;

public class CarsInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			System.out.println("Please enter car name");
			String typeOfCar = scanner.nextLine();
			CarName fromValue = CarName.fromValue(typeOfCar);
			validateUserInput("Car Name", typeOfCar);

			Cars carFromUser = new Cars(typeOfCar);
			CarService carService = null;
			switch (fromValue) {
			case BMW:
				carService = new BMW(carFromUser);
				break;
			case LEXAS:
				carService = new Lexas(carFromUser);
				break;
			case TESLA:
				carService = new Tesla(carFromUser);
				break;
			default:
				throw new CarException("Invalid Car Type. Only Cars in System Include: Bmw, Tesla, Lexas");
			}
			carService.printResult();

		} catch (CarException ce) {
			System.out.println(ce.getMessage());
		} catch (Exception e) {
			System.out.println("An unknown exception has occured. Please call help desk.");
		} finally {
			System.out.println("Thank you for allowing us to assist you");

		}
	}

	private static void validateUserInput(String string, String typeOfCar) {

	}

	private static void validateTypeOfCar(String fieldName, CarName typeOfCar) {

		if (typeOfCar.equals(CarName.INVALID))

			throw new CarException("Invalid Car Type Provided. Valid Car Types include  BMW, Teslas, and Lexas");

	}

}
