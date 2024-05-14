package Abstract;

import Entities.Customer;

public interface CustomerService {
	void addToCustomer(Customer customer);
	void deleteToCustomer(Customer customer);
	void updateToCustomer(Customer customer);
}
