package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.DeliveryDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.Delivery;
@Repository("deliveryDao")

public class DeliveryDaoHibernate extends GenericDaoHibernate<Delivery, Long> implements DeliveryDao {

	public DeliveryDaoHibernate() {
		super(Delivery.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Delivery> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Delivery> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Delivery> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Delivery get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Delivery save(Delivery object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Delivery object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Delivery> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
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
	public Delivery getDelivery(Integer deliveryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Delivery saveDelivery(Delivery delivery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeDelivery(Integer deliveryId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Delivery> getDelivery() {
		// TODO Auto-generated method stub
		return null;
	}

}
