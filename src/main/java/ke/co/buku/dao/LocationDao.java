package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Location;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface LocationDao extends GenericDao<Location, Long> {
    /**
     * {@inheritDoc}
     */
	
    List getLocations(Location location);

    /**
     * {@inheritDoc}
     */
    Location getLocation(Integer locationId);

    /**
     * {@inheritDoc}
     */
    Location saveLocation(Location location);

    /**
     * {@inheritDoc}
     */
    public void removeLocation(Integer locationId);


}
