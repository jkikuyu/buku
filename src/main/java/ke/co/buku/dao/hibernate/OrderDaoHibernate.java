package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.OrderDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.Order;
@Repository("orderDao")
public class OrderDaoHibernate extends GenericDaoHibernate<Order, Long> implements OrderDao {

	public OrderDaoHibernate() {
		super(Order.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Order getOrder(Integer orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeOrder(Integer orderId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
