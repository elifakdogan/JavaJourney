package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void addToCustomer(Customer customer) {
		System.out.println("New player added : " + customer.getFirstName());
		
	}

	@Override
	public void deleteToCustomer(Customer customer) {
		System.out.println("The player deleted : " + customer.getFirstName());
		
	}

	@Override
	public void updateToCustomer(Customer customer) {
		System.out.println("The player updated : " + customer.getFirstName());
		
	}

}
