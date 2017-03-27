package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.PaymentModeDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.PaymentMode;
@Repository("paymentModeDao")
public class PaymentModeDaoHibernate extends GenericDaoHibernate<PaymentMode, Long> implements PaymentModeDao {

	public PaymentModeDaoHibernate() {
		super(PaymentMode.class);
	}

	@Override
	public List<PaymentMode> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PaymentMode> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PaymentMode> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentMode get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PaymentMode save(PaymentMode object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(PaymentMode object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PaymentMode> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
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
	public PaymentMode getPaymentMode(Integer modeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentMode savePaymentMode(PaymentMode paymentMode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePaymentMode(Integer modeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PaymentMode> getPaymentModes() {
		// TODO Auto-generated method stub
		return null;
	}

}
