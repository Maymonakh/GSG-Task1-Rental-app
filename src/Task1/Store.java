package Task1;

public class Store extends Building {

	public Store(String address, String name, int size) {
		super(address, name, size);
	}

	public String getBuildingType() {
		return "Store";
	};

}
