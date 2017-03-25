package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.CustomerDao;
import ke.co.buku.model.Customer;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("customerManager")
public class CustomerManagerImpl extends GenericManagerImpl<Customer, Long> {
	CustomerDao customerDao;

    @Autowired
    public CustomerManagerImpl(CustomerDao customerDao) {
        super(customerDao);
        this.customerDao = customerDao;
    }

    /**
     * {@inheritDoc}
     */
	List <Customer> getCustomers(){
		return dao.getAll();
	}

    /**
     * {@inheritDoc}
     */
    Customer getCustomer(Integer customerId){
    	return customerDao.getCustomer(customerId);
    }

    /**
     * {@inheritDoc}
     */
    Customer saveCustomer(Customer customer){
    	return dao.save(customer);
    }

    /**
     * {@inheritDoc}
     */
    public void removeCustomer(Integer customerId){
    	customerDao.removeCustomer(customerId);
    	
    }

}
