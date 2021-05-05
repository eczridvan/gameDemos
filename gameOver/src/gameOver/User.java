package gameOver;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String nationalityId;
	private String birthDay;
	private String city;
	public User(int id, String firstName, String lastName, String email, String password, String nationalityId,
			String birthDay, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.nationalityId = nationalityId;
		this.birthDay = birthDay;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNatioanlityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
