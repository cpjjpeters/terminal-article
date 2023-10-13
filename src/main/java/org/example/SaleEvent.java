package org.example;

/* carlpeters created on 10/10/2023 inside the package - org.example */
public class SaleEvent {
    private String id;
    private String streetAddress;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "SaleEvent: " +
                id +
                ", " + streetAddress +
                ", " + city;
    }
}
