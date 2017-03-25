package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.Delivery;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface DeliveryManager extends GenericManager<Delivery, Long> {
    /**
     * {@inheritDoc}
     */
    List <Delivery> getDelivery();

    /**
     * {@inheritDoc}
     */
    Delivery getDelivery(Integer deliveryId);

    /**
     * {@inheritDoc}
     */
    Delivery saveDelivery(Delivery delivery);

    /**
     * {@inheritDoc}
     */
    void removeDelivery(Integer deliveryId);

}
