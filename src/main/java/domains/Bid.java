package domains;

import java.io.Serializable;

public class Bid implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private App app;
    private Device device;

    public Bid() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
