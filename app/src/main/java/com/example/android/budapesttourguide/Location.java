package com.example.android.budapesttourguide;

import android.content.Context;
import android.content.res.Resources;

public class Location {
    private String streetName;
    private String address;
    private int streetNameId;
    private int addressId;


    public Location (String streetName, String address) {
        this.streetName = streetName;
        this.address = address;
    }

    public Location (int streetNameId, int addressId) {
        this.streetNameId = streetNameId;
        this.addressId = addressId;
        this.streetName = Resources.getSystem().getString(streetNameId);
        this.address = Resources.getSystem().getString(addressId);
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStreetNameId() {return streetNameId;}

    public void setStreetNameId(int streetNameId) {this.streetNameId = streetNameId;}

    public int getAddressId() {return addressId;}

    public void setAddressId(int addressId) {this.addressId = addressId;}

    public String fullAddress(){
        return (streetName + " " + address);
    }
}
