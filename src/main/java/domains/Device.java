package domains;

import domains.Enums.OsEnum;

import java.io.Serializable;

public class Device implements Serializable {

    private static final long serialVersionUID = 1L;
    private OsEnum operatingSystem;
    private Geo geo;


    public Device() {
    }

    public OsEnum getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OsEnum operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}
