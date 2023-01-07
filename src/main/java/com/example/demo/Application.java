package com.example.demo;

public class Application {

    public static void main(String [] args )
    {
        Document dc=DocumentFactory.createDocument("pdf");
        System.out.println(dc.getDocumenttype());


    }
}
