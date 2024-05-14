import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.save(new Customer(1, "İsim", "Soyisim", LocalDateTime.of(1990, 1, 1, 0, 0),"11111111111"));
		
		BaseCustomerManager baseCustomerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager2.save(new Customer(1, "İsim", "Soyisim", LocalDateTime.of(1993, 1, 1, 0, 0),"11111111111"));
		
		
		
	}

}
