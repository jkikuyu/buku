package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.PaymentModeDao;
import ke.co.buku.model.PaymentMode;
import ke.co.buku.model.User;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */

public interface PaymentModeManager extends GenericManager<PaymentMode, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param paymentModeDao the PaymentModeDao implementation to use
     */

	void setPaymentModeDao(PaymentModeDao paymentModeDao);

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
    /**
     * Search a user for search terms.
     * @param searchTerm the search terms.
     * @return a list of matches, or all if no searchTerm.
     */
    List<PaymentMode> search(String searchTerm);


}
