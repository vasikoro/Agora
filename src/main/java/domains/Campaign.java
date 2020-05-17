package domains;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Campaign implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private Double price;
    private String adm;
    private List<String> targetedCountries;

    public Campaign() {
        this.targetedCountries = new ArrayList<>();
    }

    public void addCountry(String country){
        this.getTargetedCountries().remove(country);
        this.getTargetedCountries().add(country);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAdm() {
        return adm;
    }

    public void setAdm(String adm) {
        this.adm = adm;
    }

    public List<String> getTargetedCountries() {
        return targetedCountries;
    }

    public void setTargetedCountries(List<String> targetedCountries) {
        this.targetedCountries = targetedCountries;
    }
}
