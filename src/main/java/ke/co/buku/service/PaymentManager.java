package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.Order;
import ke.co.buku.model.Payment;
/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */

public interface PaymentManager extends GenericManager<Payment, Long> {
	
    /**
     * {@inheritDoc}
     */
    List <Payment> getPayments();

    /**
     * {@inheritDoc}
     */
    Order getPayment(Integer paymentId);

    /**
     * {@inheritDoc}
     */
    Order savePayment(Payment payment);

    /**
     * {@inheritDoc}
     */
    void removePaymentr(Integer paymentId);


}