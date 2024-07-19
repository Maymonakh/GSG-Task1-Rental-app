package Task1;

public class Apartment extends Building {

	public Apartment(String address, String name, int size) {
		super(address, name, size);
	}

	public String getBuildingType() {
		return "Apartment";
	};

}
