package coffeeProject;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer) {
		if (customerCheckService.checkService(customer)) {
			System.out.println("Müþteri eklendi");
		} else {
			System.out.println("Not a valid person.");
		}
	}
}
