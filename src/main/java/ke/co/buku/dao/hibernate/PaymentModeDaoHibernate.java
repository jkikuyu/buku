package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.PaymentModeDao;
import ke.co.buku.model.PaymentMode;
@Repository("paymentModeDao")
public class PaymentModeDaoHibernate extends GenericDaoHibernate<PaymentMode, Long> implements PaymentModeDao {

	public PaymentModeDaoHibernate() {
		super(PaymentMode.class);
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
