package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.CustomerDao;
import ke.co.buku.model.Customer;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */

public interface CustomerManager extends GenericManager<Customer, Long> {

    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param customerDao the CustomerDao implementation to use
     */

	void setCustomerDao(CustomerDao customerDao);

    /**
     * {@inheritDoc}
     */
	List <Customer> getCustomers();

    /**
     * {@inheritDoc}
     */
    Customer getCustomer(Integer customerId);

    /**
     * {@inheritDoc}
     */
    Customer saveCustomer(Customer customer);

    /**
     * {@inheritDoc}
     */
    void removeCustomer(Integer customerId);

}
