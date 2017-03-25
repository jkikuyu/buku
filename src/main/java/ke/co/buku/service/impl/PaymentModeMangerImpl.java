package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.PaymentModeDao;
import ke.co.buku.model.PaymentMode;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("paymentModeManger")
public class PaymentModeMangerImpl extends GenericManagerImpl<PaymentMode, Long> {
	PaymentModeDao paymentModeDao;

    @Autowired
    public PaymentModeMangerImpl(PaymentModeDao paymentModeDao) {
        super(paymentModeDao);
        this.paymentModeDao = paymentModeDao;
    }

	/**
     * {@inheritDoc}
     */
    List <PaymentMode> getPaymentModes(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    PaymentMode getPaymentMode(Integer modeId){
    	return paymentModeDao.getPaymentMode(modeId);
    }

    /**
     * {@inheritDoc}
     */
    public PaymentMode savePaymentMode(PaymentMode paymentMode){
    	return dao.save(paymentMode);
    }

    /**
     * {@inheritDoc}
     */
    public void removePaymentMode(Integer modeId){
    	paymentModeDao.removePaymentMode(modeId);
    }


}
