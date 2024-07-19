package Task1;

public abstract class Building {
	private String address;
	private String name;
	private int size;

	public Building(String address, String name, int size) {
		this.address = address;
		this.name = name;
		this.size = size;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public abstract String getBuildingType();

}
