package kodlamaIODemos;

public class User {
	
	private int Id;
	private String city;
	
	public User(int id, String city) {
		super();
		Id = id;
		this.city = city;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
