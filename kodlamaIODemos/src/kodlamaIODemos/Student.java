package kodlamaIODemos;

public class Student extends User{
	
	private int Id;
	private String firstName;
	private String lastName;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int id, String city, int id2, String firstName, String lastName, int age) {
		super(id, city);
		Id = id2;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}
