package domains;

import java.io.Serializable;

public class App implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String Name;

    public App() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
