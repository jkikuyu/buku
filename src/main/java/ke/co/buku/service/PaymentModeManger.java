package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.BookList;
import ke.co.buku.model.PaymentMode;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */

public interface PaymentModeManger extends GenericManager<PaymentMode, Long> {
    /**
     * {@inheritDoc}
     */
    List <PaymentMode> getPaymentModes();

    /**
     * {@inheritDoc}
     */
    PaymentMode getPaymentMode(Integer modeId);

    /**
     * {@inheritDoc}
     */
    PaymentMode savePaymentMode(PaymentMode paymentMode);

    /**
     * {@inheritDoc}
     */
    void removePaymentMode(Integer modeId);


}
