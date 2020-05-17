package com.airhacks.ping.boundary;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.airhacks.Service.CampaignClientService;
import domains.Bid;
import domains.BidResponse;
import domains.Campaign;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Path("Campaigns")
public class PingResource {

    @Inject
    private CampaignClientService campaignClientService;

    @Inject
    @ConfigProperty(name = "message")
    String message;    


    @Path("submitBid")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response bidRequest(Bid bid){
        //get campaigns
        List<Campaign> campaigns = campaignClientService.getCampaigns();

        //match targeting
        String bidderCountry = bid.getDevice().getGeo().getCountry();

        //sort on price
        List<Campaign> matchedCountries =
        campaigns.stream().filter(cmp -> cmp.getTargetedCountries().contains(bidderCountry)).sorted(Comparator.comparingDouble(Campaign::getPrice)).collect(Collectors.toList());

        //check which response to send
        if(matchedCountries.isEmpty()) {
            //response 200 or 204
            return Response.status(Response.Status.NO_CONTENT).build();
        }else {
            BidResponse bidResponse = new BidResponse();
            bidResponse.setId(bid.getId());
            bidResponse.setCampaign(new Campaign());
            bidResponse.getCampaign().setId(matchedCountries.get(0).getId());
            bidResponse.getCampaign().setPrice(matchedCountries.get(0).getPrice());
            bidResponse.getCampaign().setAdm(matchedCountries.get(0).getAdm());
            return Response.ok(bidResponse).status(Response.Status.OK).build();
        }

    }

}
