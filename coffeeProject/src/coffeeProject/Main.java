package coffeeProject;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1, "RIDVAN", "BOZKIR", "1991", "12365498745"));
		
	}

}
