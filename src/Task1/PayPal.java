package Task1;

public class PayPal implements PaymentMethod {

	@Override
	public void paymentProcess(String customer, double amount) {
		System.out.println(customer + " paid the rent amount of : " + amount + " via PayPal");
	}

	@Override
	public String getPaymentMethod() {
		return "PayPal";
	}
}
