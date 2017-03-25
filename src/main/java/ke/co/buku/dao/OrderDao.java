package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Order;
/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface OrderDao extends GenericDao<Order, Long> {
    /**
     * {@inheritDoc}
     */
	public List <Order> getOrders();

    /**
     * {@inheritDoc}
     */
	public Order getOrder(Integer orderId);

    /**
     * {@inheritDoc}
     */
	public Order saveOrder(Order order);

    /**
     * {@inheritDoc}
     */
	public void removeOrder(Integer orderId);


}
