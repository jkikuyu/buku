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
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order save(Order object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Order object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Order> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reindex() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reindexAll(boolean async) {
		// TODO Auto-generated method stub

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
