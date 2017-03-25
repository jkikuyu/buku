package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.DeliveryDao;
import ke.co.buku.model.Delivery;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("deliveryManager")
public class DeliveryManagerImpl extends GenericManagerImpl<Delivery, Long> {
	DeliveryDao deliveryDao;

    @Autowired
    public DeliveryManagerImpl(DeliveryDao deliveryDao) {
        super(deliveryDao);
        this.deliveryDao = deliveryDao;
    }

	/**
     * {@inheritDoc}
     */
    List <Delivery>getDeliveries(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    Delivery getDelivery(Integer deliveryId){
    	return deliveryDao.getDelivery(deliveryId);
    }

    /**DeliveryDao
     * {@inheritDoc}
     */
    Delivery saveDelivery(Delivery delivery){
    	return deliveryDao.save(delivery);
    }

    /**
     * {@inheritDoc}
     */
    public void removeDelivery(Integer deliveryId){
    	deliveryDao.removeDelivery(deliveryId);
    }

}
