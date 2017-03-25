package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.PaymentMode;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface PaymentModeDao extends GenericDao<PaymentMode, Long> {
    /**
     * {@inheritDoc}
     */
	public List <PaymentMode> getPaymentModes();

    /**
     * {@inheritDoc}
     */
    public PaymentMode getPaymentMode(Integer modeId);

    /**
     * {@inheritDoc}
     */
    public PaymentMode savePaymentMode(PaymentMode paymentMode);

    /**
     * {@inheritDoc}
     */
    public void removePaymentMode(Integer modeId);


}
