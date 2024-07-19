package Task1;

public class Visa implements PaymentMethod {

	@Override
	public void paymentProcess(String customer, double amount) {
		System.out.println(customer + " paid the rent amount of : " + amount + " via Visa");
	}

	@Override
	public String getPaymentMethod() {
		return "Visa";
	}

}
