package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Delivery;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface DeliveryDao extends GenericDao<Delivery, Long> {
    /**
     * {@inheritDoc}
     */
	public List <Delivery> getDeliveries();

    /**
     * {@inheritDoc}
     */
	public Delivery getDelivery(Integer deliveryId);

    /**
     * {@inheritDoc}
     */
	public Delivery saveDelivery(Delivery delivery);

    /**
     * {@inheritDoc}
     */
	public void removeDelivery(Integer deliveryId);

}
