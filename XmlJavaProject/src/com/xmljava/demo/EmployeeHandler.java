package com.xmljava.demo;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmployeeHandler extends DefaultHandler {

    boolean chairMan, boardOfDirector;
    boolean generalMgr, regionalMgr;
    boolean officeMgr, teamLeader;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if(qName.equalsIgnoreCase("topManagement")) {

            String topId = attributes.getValue("id");
            System.out.println("Id of Top Management: " +topId);
        }

        else if(qName.equalsIgnoreCase("chairman")) {
            chairMan = true;
        }

        else if(qName.equalsIgnoreCase("boardOfDirector")) {
            boardOfDirector = true;
        }

        if(qName.equalsIgnoreCase("middleManagement")) {

            String middleId = attributes.getValue("id");
            System.out.println("Id of Middle Management: " +middleId);
        }

        else if(qName.equalsIgnoreCase("generalManager")) {
            generalMgr = true;
        }

        else if(qName.equalsIgnoreCase("regionalManager")) {
            regionalMgr = true;
        }

        if(qName.equalsIgnoreCase("firstLineManagement")) {

            String firstLineId = attributes.getValue("id");
            System.out.println("Id of Middle Management: " +firstLineId);
        }

        else if(qName.equalsIgnoreCase("officeManager")) {
            officeMgr = true;
        }

        else if(qName.equalsIgnoreCase("teamLeader")) {
            teamLeader = true;
        }
    }

    @Override
    public void endElement(String uri , String localName , String qName) throws SAXException {

        if(qName.equalsIgnoreCase("topManagement")) {

            System.out.println("End Element of top management: " +qName);
        }

        else if(qName.equalsIgnoreCase("middleManagement")) {

            System.out.println("End Element of middle management: " +qName);
        }

        if(qName.equalsIgnoreCase("firstLineManagement")) {

            System.out.println("End Element of First Line management: " +qName);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (chairMan) {
            System.out.println("ChairMan : " + new String(ch, start, length));
            chairMan = false;
        }

        else if (boardOfDirector) {
            System.out.println("Board Of Director: " + new String(ch, start, length));
            boardOfDirector = false;
        }

        else if (generalMgr) {
            System.out.println("General Manager: " + new String(ch, start, length));
            generalMgr = false;
        }

        else if (regionalMgr) {
            System.out.println("Regional Manager: " + new String(ch, start, length));
            regionalMgr = false;
        }

        else if (officeMgr) {
            System.out.println("Office Manager: " + new String(ch, start, length));
            officeMgr = false;
        }

        else if (teamLeader) {
            System.out.println("Team Leader: " + new String(ch, start, length));
            teamLeader = false;
        }
    }



}
