package domains;

import java.io.Serializable;

public class BidResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private Campaign campaign;

    public BidResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
}
