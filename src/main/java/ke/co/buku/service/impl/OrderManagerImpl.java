package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.OrderDao;
import ke.co.buku.model.Order;
import ke.co.buku.service.OrderManager;
/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("orderManager")
public class OrderManagerImpl extends GenericManagerImpl<Order, Long> implements OrderManager{
	private OrderDao orderDao;

	@Override
	@Autowired
	public void setOrderDao(OrderDao orderDao) {
        this.dao = orderDao;
        this.orderDao = orderDao;
		
	}

	
/*    public OrderManagerImpl(OrderDao orderDao) {
        super(orderDao);
        this.orderDao = orderDao;
    }
*/
	/**
     * {@inheritDoc}
     */
    public List <Order> getOrders(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    public Order getOrder(Integer orderId){
    	return orderDao.getOrder(orderId);
    }

    /**
     * {@inheritDoc}
     */
    public Order saveOrder(Order order){
    	return dao.save(order);
    }

    /**
     * {@inheritDoc}
     */
    public void removeOrder(Integer orderId){
    	orderDao.removeOrder(orderId);
    }



}
