package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	
	public boolean checkIfRealPerson(Customer customer) {
	    try {
	        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
	    } catch (RemoteException e) {
	        // Handle the exception, or log it, or throw a different exception, depending on your application's requirements.
	        e.printStackTrace(); // Example of handling by printing the stack trace
	        return false; // Or handle it in any other appropriate way
	    }
	}

}
