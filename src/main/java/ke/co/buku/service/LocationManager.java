package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.Location;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface LocationManager extends GenericManager<Location, Long> {
    /**
     * {@inheritDoc}
     */
	
    List <Location> getLocations();

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
    void removeLocation(Integer locationId);


}
