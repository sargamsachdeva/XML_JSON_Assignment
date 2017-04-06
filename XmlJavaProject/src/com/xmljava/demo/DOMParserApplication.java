package com.xmljava.demo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMParserApplication {

    public static void main(String[] args) {

        try {

            File inputFile = new File("input.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("topManagement");
            System.out.println("=================================");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Top Management Id: " + eElement.getAttribute("id"));

                    System.out.println("ChairMan: " + eElement.getElementsByTagName("chairman")
                            .item(0).getTextContent());

                    System.out.println("Board of Director: " + eElement.getElementsByTagName("boardOfDirector")
                            .item(0).getTextContent());
                }
            }

            NodeList nList1 = doc.getElementsByTagName("middleManagement");
            System.out.println("=================================");


            for (int temp = 0; temp < nList1.getLength(); temp++) {

                Node nNode = nList1.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("Middle Management Id: " + eElement.getAttribute("id"));

                    System.out.println("General Manager: " + eElement.getElementsByTagName("generalManager")
                            .item(0).getTextContent());

                    System.out.println("Regional Manager: " + eElement.getElementsByTagName("regionalManager")
                            .item(0).getTextContent());


                }
            }


            NodeList nList2 = doc.getElementsByTagName("firstLineManagement");
            System.out.println("=================================");


            for (int temp = 0; temp < nList2.getLength(); temp++) {

                Node nNode = nList2.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;


                    System.out.println("First Line Management Id: " + eElement.getAttribute("id"));

                    System.out.println("Office Manager: " + eElement.getElementsByTagName("officeManager")
                            .item(0).getTextContent());

                    System.out.println("Team Leader: " + eElement.getElementsByTagName("teamLeader")
                            .item(0).getTextContent());

                }
            }
        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }

}

