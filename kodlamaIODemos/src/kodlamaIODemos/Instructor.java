package kodlamaIODemos;

public class Instructor extends User {
	private int Id;
	private String firstName;
	private String lastName;
	private String branch;
	private int age;
	public Instructor(int id, String city, int id2, String firstName, String lastName, String branch, int age) {
		super(id, city);
		Id = id2;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		this.age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
