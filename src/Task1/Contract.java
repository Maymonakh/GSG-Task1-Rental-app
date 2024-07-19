package Task1;

public class Contract {
	private String rentalPeriod;
	private double price;
	Customer customer;
	Building building;
	PaymentMethod paymentMethod;

	public Contract(String rentalPeriod, double price, Customer customer, Building building,
			PaymentMethod paymentMethod) {
		this.rentalPeriod = rentalPeriod;
		this.price = price;
		this.customer = customer;
		this.building = building;
		this.paymentMethod = paymentMethod;
	}

	public void contractDetails() {
		System.out.println("Contract Details:\nCustomer: " + customer.getName() + "\nBuilding: " + building.getName()
				+ " (" + building.getBuildingType() + ")" + "\nPhone Number: " + customer.getPhoneNumber()
				+ "\nRental Period: " + rentalPeriod + "\nPrice: " + price + "\nPayment Method: "
				+ paymentMethod.getPaymentMethod());

	}

	public void processPayment() {
		paymentMethod.paymentProcess(customer.getName(), price);
	}
}
