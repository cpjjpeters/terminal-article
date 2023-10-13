package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SaleEvent saleEvent = new SaleEvent();
        saleEvent.setId("100");
        saleEvent.setStreetAddress("123 Main St.");
        saleEvent.setCity("Naperville");

        System.out.println(saleEvent.toString());
        ObjectMapper Obj = new ObjectMapper();
        try {
            String jsonStr = Obj.writeValueAsString(saleEvent);
            // Displaying Java object into a JSON string
            System.out.println(jsonStr);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}