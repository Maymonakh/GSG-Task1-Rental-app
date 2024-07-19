package Task1;

public class Test {

	public static void main(String[] args) {

		Building apartment = new Apartment("Haifa Street", "Al-Zahrah", 400);
		Building store = new Store("Nablus Street", "Al-Sham Store", 200);

		Customer Ahmad = new Customer("Ahmad Omar", "059-999-9999");
		Ahmad.rentBuilding(apartment);
		Ahmad.rentBuilding(store);

		PaymentMethod payPal = new PayPal();
		Contract contract = new Contract("1 year", 2000, Ahmad, store, payPal);

		contract.contractDetails();
		contract.processPayment();

	}

}
