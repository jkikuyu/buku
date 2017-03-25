package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.CustomerDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.Customer;
@Repository("customerDao")

public class CustomerDaoHibernate extends GenericDaoHibernate<Customer, Long> implements CustomerDao {

	public CustomerDaoHibernate() {
		super(Customer.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer save(Customer object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Customer object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Customer> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reindex() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reindexAll(boolean async) {
		// TODO Auto-generated method stub

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
