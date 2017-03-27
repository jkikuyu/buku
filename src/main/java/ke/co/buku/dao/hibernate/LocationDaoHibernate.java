package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.LocationDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.Location;
@Repository("locationDao")
public class LocationDaoHibernate extends GenericDaoHibernate<Location, Long> implements LocationDao {

	public LocationDaoHibernate() {
		super(Location.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Location> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Location> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Location> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Location save(Location object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Location object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Location> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
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
	public List getLocations(Location location) {
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
