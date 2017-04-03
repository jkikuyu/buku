package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.LocationDao;
import ke.co.buku.model.Location;
@Repository("locationDao")
public class LocationDaoHibernate extends GenericDaoHibernate<Location, Long> implements LocationDao {

	public LocationDaoHibernate() {
		super(Location.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Location> getLocations(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getLocation(Integer locationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLocation(Integer locationId) {
		// TODO Auto-generated method stub

	}


}
