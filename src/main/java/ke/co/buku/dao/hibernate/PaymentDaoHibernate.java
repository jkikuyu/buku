package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.PaymentDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.Order;
import ke.co.buku.model.Payment;
@Repository("paymentDao")
public class PaymentDaoHibernate extends GenericDaoHibernate<Payment, Long> implements PaymentDao {

	public PaymentDaoHibernate() {
		super(Payment.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Payment> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Payment save(Payment object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Payment object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Payment> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
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
	public List<Payment> getPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getPayment(Integer paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment savePayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePayment(Integer paymentId) {
		// TODO Auto-generated method stub
		
	}

}
