package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.PaymentDao;
import ke.co.buku.model.Payment;
@Repository("paymentDao")
public class PaymentDaoHibernate extends GenericDaoHibernate<Payment, Long> implements PaymentDao {

	public PaymentDaoHibernate() {
		super(Payment.class);
		// TODO Auto-generated constructor stub
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
