package org.framework.rodolfo.freire.git.basic.model;

public class Address {

    private String addressType;
    private boolean addressPreferred;
    private String postalCode;
    private String streetLine1;
    private String streetLine2;
    private String streetLine3;
    private String streetLine4;
    private String city;
    private String state;
    private String country;

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public boolean isAddressPreferred() {
        return addressPreferred;
    }

    public void setAddressPreferred(boolean addressPreferred) {
        this.addressPreferred = addressPreferred;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public String getStreetLine3() {
        return streetLine3;
    }

    public void setStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
    }

    public String getStreetLine4() {
        return streetLine4;
    }

    public void setStreetLine4(String streetLine4) {
        this.streetLine4 = streetLine4;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
