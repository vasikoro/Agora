package com.airhacks.Service;

import domains.Campaign;
import org.json.JSONObject;
import org.json.JSONTokener;

import javax.json.JsonArray;
import javax.json.JsonValue;
import java.io.FileReader;
import java.util.Iterator;

public class JSONReader {

    private static final String filePath = "/home/vasilis/workspace/Agora/bidder_case_study/test_case_1_campaign_api_mock.json";

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try (FileReader reader = new FileReader(ClassLoader.getSystemResource(filePath).getFile())){
            JSONTokener tokener = new JSONTokener(reader);
            JSONObject jsonObject = new JSONObject(tokener);
            Campaign campaign = new Campaign();

            campaign.setId((String) jsonObject.get("id"));
            campaign.setName((String) jsonObject.get("name"));
            campaign.setAdm();
            // A JSON array. JSONObject supports java.util.List interface.
             JsonArray countries = (JsonArray) jsonObject.get("countries");

            Iterator<JsonValue> iterator = countries.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
