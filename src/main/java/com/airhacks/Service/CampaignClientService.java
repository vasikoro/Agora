package com.airhacks.Service;

import domains.Campaign;

import javax.ejb.Stateless;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Stateless
public class CampaignClientService implements Serializable {

    public List<Campaign> getCampaigns() {
        List<Campaign> campaignList = new ArrayList<>();
        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("GBR");
        countries.add("GRC");

        Campaign campaign = new Campaign();
        campaign.setId("5a3dce46");
        campaign.setName("Test Campaign 1");
        campaign.setPrice(1.23);
        campaign.setAdm("<a href=\"http://example.com/click/qbFCjzXR9rkf8qa4\">" +
                "<img src=\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\"" +
                " height=\"250\" width=\"300\" alt=\"\"/></a><img src=\"http://example.com/win/qbFCjzXR9rkf8qa4\" " +
                "height=\"1\" width=\"1\" alt=\"\"/>\r\n");
        campaign.setTargetedCountries(countries);

        campaignList.add(campaign);
        return campaignList;
    }
}
