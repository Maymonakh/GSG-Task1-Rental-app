package Task1;

public class MasterCard implements PaymentMethod {

	@Override
	public void paymentProcess(String customer, double amount) {
		System.out.println(customer + " paid the rent amount of : " + amount + " via MasterCard");
	}

	@Override
	public String getPaymentMethod() {
		return "MasterCard";
	}

}
