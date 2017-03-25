package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.Order;
/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */

public interface OrderManager extends GenericManager<Order, Long> {
    /**
     * {@inheritDoc}
     */
    List <Order> getOrders();

    /**
     * {@inheritDoc}
     */
    Order getOrder(Integer orderId);

    /**
     * {@inheritDoc}
     */
    Order saveOrder(Order order);

    /**
     * {@inheritDoc}
     */
    void removeOrder(Integer orderId);


}
