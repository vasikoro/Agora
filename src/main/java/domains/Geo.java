package domains;

import java.io.Serializable;

public class Geo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String country;
    private Long lat;
    private Long lon;

    public Geo() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getLat() {
        return lat;
    }

    public void setLat(Long lat) {
        this.lat = lat;
    }

    public Long getLon() {
        return lon;
    }

    public void setLon(Long lon) {
        this.lon = lon;
    }
}
