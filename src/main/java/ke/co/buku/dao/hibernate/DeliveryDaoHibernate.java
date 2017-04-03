package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.DeliveryDao;
import ke.co.buku.model.Delivery;
@Repository("deliveryDao")

public class DeliveryDaoHibernate extends GenericDaoHibernate<Delivery, Long> implements DeliveryDao {

	public DeliveryDaoHibernate() {
		super(Delivery.class);
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
	public List<Delivery> getDeliveries() {
		// TODO Auto-generated method stub
		return null;
	}

}
