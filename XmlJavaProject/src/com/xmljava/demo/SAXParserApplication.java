package com.xmljava.demo;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SAXParserApplication {

    public static void main(String[] args) {

        try {

            File inputFile = new File("input.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            EmployeeHandler employeeHandler = new EmployeeHandler();
            saxParser.parse(inputFile, employeeHandler);
        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }
}
