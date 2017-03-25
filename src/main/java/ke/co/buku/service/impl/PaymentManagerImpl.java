package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.PaymentDao;
import ke.co.buku.model.Payment;
/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("paymentManager")
public class PaymentManagerImpl extends GenericManagerImpl<Payment, Long> {
	PaymentDao paymentDao;

    @Autowired
    public PaymentManagerImpl(PaymentDao paymentDao) {
        super(paymentDao);
        this.paymentDao = paymentDao;
    }

    /**
     * {@inheritDoc}
     */
    public List <Payment> getPayments(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    public Payment getPayment(Integer paymentId){
    	return paymentDao.getPayment(paymentId);
    }

    /**
     * {@inheritDoc}
     */
    public Payment savePayment(Payment payment){
    	return dao.save(payment);
    }

    /**
     * {@inheritDoc}
     */
    public void removePaymentr(Integer paymentId){
    	paymentDao.removePayment(paymentId);
    }


}
