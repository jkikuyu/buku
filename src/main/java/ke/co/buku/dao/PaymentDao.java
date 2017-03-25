package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Payment;
/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */


public interface PaymentDao extends GenericDao<Payment, Long> {
	
    /**
     * {@inheritDoc}
     */
	public List <Payment> getPayments();

    /**
     * {@inheritDoc}
     */
    public Payment getPayment(Integer paymentId);

    /** 
     * {@inheritDoc}
     */
    public Payment savePayment(Payment payment);

    /**
     * {@inheritDoc}
     */
    public void removePayment(Integer paymentId);


}
