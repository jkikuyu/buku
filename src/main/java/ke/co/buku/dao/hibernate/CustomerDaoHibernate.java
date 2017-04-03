package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.CustomerDao;
import ke.co.buku.model.Customer;
@Repository("customerDao")

public class CustomerDaoHibernate extends GenericDaoHibernate<Customer, Long> implements CustomerDao {

	public CustomerDaoHibernate() {
		super(Customer.class);
	}


	@Override
	public Customer getCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCustomer(Integer customerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
