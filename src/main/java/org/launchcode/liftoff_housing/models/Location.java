package org.launchcode.liftoff_housing.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Objects;


@Entity
public class Location {

    @Id
    @GeneratedValue
    private int id;


    //private String name;
    private String address;
    private double longitude;
    private double latitude;
    private int zip;
    @OneToOne(mappedBy = "location")
    private HousingCommunity housingCommunity;

    public Location(){

    }

    public Location(String address, double longitude, double latitude, int zip, HousingCommunity housingCommunity) {
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.zip = zip;
        this.housingCommunity = housingCommunity;
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public HousingCommunity getHousingCommunity() {
        return housingCommunity;
    }

    public void setHousingCommunity(HousingCommunity housingCommunity) {
        this.housingCommunity = housingCommunity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    @Override
    public String toString() {
        return "Location{" +
                "housingCommunity=" + housingCommunity +
                '}';
    }
}
