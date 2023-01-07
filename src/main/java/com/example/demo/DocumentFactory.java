package com.example.demo;

public class DocumentFactory {

    public static Document createDocument(final String name) {

        if (name.equals("pdf")) {
            return new Pdf();

        } else if (name.equals("word")) {
            return new Word();

        }else{

            throw new RuntimeException("Document tipi belli deil");
        }


    }
}


