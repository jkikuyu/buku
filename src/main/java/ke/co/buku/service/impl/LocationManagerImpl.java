package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.LocationDao;
import ke.co.buku.model.Location;
import ke.co.buku.service.LocationManager;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("locationManager")
public class LocationManagerImpl extends GenericManagerImpl<Location, Long> implements LocationManager{
	LocationDao locationDao;

    @Autowired
    public LocationManagerImpl(LocationDao locationDao) {
        super(locationDao);
        this.locationDao = locationDao;
    }

	/**
     * {@inheritDoc}
     */
	
    List <Location> getLocations(Location location){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    public Location getLocation(Integer locationId){
    	return locationDao.getLocation(locationId);
    }

    /**
     * {@inheritDoc}
     */
    public Location saveLocation(Location location){
    	return dao.save(location);
    }

    /**
     * {@inheritDoc}
     */
    public void removeLocation(Integer locationId){
    	locationDao.removeLocation(locationId);
    	
    }

	@Override
	public List<Location> getLocations() {
		// TODO Auto-generated method stub
		return null;
	}



}
