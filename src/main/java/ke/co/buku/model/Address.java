package ke.co.buku.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

/**
 * This class is used to represent an address with address,
 * city, province and postal-code information.
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
@Embeddable
@Indexed
public class Address extends BaseObject implements Serializable {
    private static final long serialVersionUID = 3617859655330969141L;
    private String physicalAddress;
    private String city;
    private String province;
    private String country;
    private String postalCode;

    @Column(length = 150)
    @Field
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    @Column(length = 50)
    @Field
    public String getCity() {
        return city;
    }

    @Column(length = 100)
    @Field
    public String getProvince() {
        return province;
    }

    @Column(length = 100)
    @Field
    public String getCountry() {
        return country;
    }

    @Column(name = "postal_code", length = 15)
    @Field(analyze= Analyze.NO)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Overridden equals method for object comparison. Compares based on hashCode.
     *
     * @param o Object to compare
     * @return true/false based on hashCode
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Address)) {
            return false;
        }

        final Address address1 = (Address) o;

        return this.hashCode() == address1.hashCode();
    }

    /**
     * Overridden hashCode method - compares on address, city, province, country and postal code.
     *
     * @return hashCode
     */
    public int hashCode() {
        int result;
        result = (physicalAddress != null ? physicalAddress.hashCode() : 0);
        result = 29 * result + (city != null ? city.hashCode() : 0);
        result = 29 * result + (province != null ? province.hashCode() : 0);
        result = 29 * result + (country != null ? country.hashCode() : 0);
        result = 29 * result + (postalCode != null ? postalCode.hashCode() : 0);
        return result;
    }

    /**
     * Returns a multi-line String with key=value pairs.
     *
     * @return a String representation of this class.
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("country", this.country)
                .append("physical address", this.physicalAddress)
                .append("province", this.province)
                .append("postalCode", this.postalCode)
                .append("city", this.city).toString();
    }
    //http://appfuse.547863.n4.nabble.com/User-country-value-td554821.html
    //http://www.servletsuite.com/servlets/cntrtag.htm
    protected List buildCountryList(Locale locale) {
        final String EMPTY = "";
        final Locale[] available = Locale.getAvailableLocales();

        List countries = new ArrayList();

        for (int i = 0; i < available.length; i++) {
            final String iso = available[i].getCountry();
            final String name = available[i].getDisplayCountry(locale);

            if (!EMPTY.equals(iso) && !EMPTY.equals(name)) {
                LabelValue country = new LabelValue(name, iso);
                

                if (!countries.contains(country)) {
                    countries.add(new LabelValue(name, iso));
                }
            }
        }

       // Collections.sort(countries, new LabelValueComparator(locale));

        return countries;
    }

}
