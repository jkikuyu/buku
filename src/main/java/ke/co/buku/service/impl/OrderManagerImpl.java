package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.BookListDao;
import ke.co.buku.dao.OrderDao;
import ke.co.buku.model.Order;
/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("orderManager")
public class OrderManagerImpl extends GenericManagerImpl<Order, Long> {
	OrderDao orderDao;

    @Autowired
    public OrderManagerImpl(OrderDao orderDao) {
        super(orderDao);
        this.orderDao = orderDao;
    }

	/**
     * {@inheritDoc}
     */
    List <Order> getOrders(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    Order getOrder(Integer orderId){
    	return orderDao.getOrder(orderId);
    }

    /**
     * {@inheritDoc}
     */
    Order saveOrder(Order order){
    	return dao.save(order);
    }

    /**
     * {@inheritDoc}
     */
    public void removeOrder(Integer orderId){
    	orderDao.removeOrder(orderId);
    }


}
