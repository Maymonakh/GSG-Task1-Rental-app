package Task1;

public class House extends Building {

	public House(String address, String name, int size) {
		super(address, name, size);
	}

	public String getBuildingType() {
		return "House";
	};

}
