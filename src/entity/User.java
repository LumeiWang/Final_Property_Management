package entity;

public class User {
	private int ID;
	private String Name;
	private String Email;
	private String Password;
	private String Phone;
	private int PropertyID;
	private int Status;

	public User(int userID, String name, String email, String password, String phone, int userPropertyID, int status) {
		super();
		ID = userID;
		Name = name;
		Email = email;
		Password = password;
		Phone = phone;
		PropertyID = userPropertyID;
		Status = status;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public int getPropertyID() {
		return PropertyID;
	}

	public void setPropertyID(int propertyID) {
		PropertyID = propertyID;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}
}
