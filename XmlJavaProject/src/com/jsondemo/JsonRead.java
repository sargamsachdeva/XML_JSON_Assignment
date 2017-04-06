package com.jsondemo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JsonRead {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("index.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String topManagementId = (String)jsonObject.get("topManagementId");
            System.out.println("Top Management Id: " +topManagementId);

            String chairman = (String) jsonObject.get("chairman");
            System.out.println("Chairman: " +chairman);

            String boardOfDirector = (String) jsonObject.get("boardOfDirector");
            System.out.println("Board of Director: " +boardOfDirector);

            String middleManagementId = (String)jsonObject.get("middleManagementId");
            System.out.println("Middle Management Id: " +middleManagementId);

            String generalManager = (String) jsonObject.get("generalManager");
            System.out.println("General Manager: " +generalManager);

            String regionalManager = (String) jsonObject.get("regionalManager");
            System.out.println("Regional Manager: " +regionalManager);

            String firstLevelManagementId = (String)jsonObject.get("firstLevelManagementId");
            System.out.println("First Level Management Id: " +firstLevelManagementId);

            String officeManager = (String) jsonObject.get("officeManager");
            System.out.println("Office Manager: " +officeManager);

            String teamLeader = (String) jsonObject.get("teamLeader");
            System.out.println("Team Leader: " +teamLeader);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
