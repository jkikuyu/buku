package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Customer;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface CustomerDao extends GenericDao<Customer, Long> {
	
    /**
     * {@inheritDoc}
     */
	public List <Customer> getCustomers();

    /**
     * {@inheritDoc}
     */
	public Customer getCustomer(Integer customerId);

    /**
     * {@inheritDoc}
     */
	public Customer saveCustomer(Customer customer);

    /**
     * {@inheritDoc}
     */
	public void removeCustomer(Integer customerId);

}
