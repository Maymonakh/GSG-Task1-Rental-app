package Task1;

import java.util.*;

public class Customer {
	private String name;
	private String PhoneNumber;
	List<Building> rentedBuildings = new ArrayList<Building>();

	public Customer(String name, String phoneNumber) {
		this.name = name;
		PhoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public List<Building> getRentedBuildings() {
		return rentedBuildings;
	}

	public void setRentedBuildings(List<Building> rentedBuildings) {
		this.rentedBuildings = rentedBuildings;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public void rentBuilding(Building building) {
		rentedBuildings.add(building);
	}

}
