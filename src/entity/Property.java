package entity;

public class Property {
	private int ID;
	private String Name;
	private String Status;
	private int Bedroom;
	private int Bathroom;
	private String Zip;
	private String Price;
	private String City;
	private String Address;
	private String Description;
	private String OwnerName;
	private String OwnerEmail;

	public Property(int iD, String name, String status, int bedroom, int bathroom, String zip, String price,
			String city, String address, String description, String ownerName, String ownerEmail) {
		super();
		ID = iD;
		Name = name;
		Status = status;
		Bedroom = bedroom;
		Bathroom = bathroom;
		Zip = zip;
		Price = price;
		City = city;
		Address = address;
		Description = description;
		OwnerName = ownerName;
		OwnerEmail = ownerEmail;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getBedroom() {
		return Bedroom;
	}

	public void setBedroom(int bedroom) {
		Bedroom = bedroom;
	}

	public int getBathroom() {
		return Bathroom;
	}

	public void setBathroom(int bathroom) {
		Bathroom = bathroom;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String propertyCity) {
		this.City = propertyCity;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public String getOwnerEmail() {
		return OwnerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		OwnerEmail = ownerEmail;
	}
}
