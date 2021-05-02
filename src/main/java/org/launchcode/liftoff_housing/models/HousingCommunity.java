package org.launchcode.liftoff_housing.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Objects;

@Entity
public class HousingCommunity {


    @Id
    @GeneratedValue
    private int id;

    // @NotBlank how to get validation package to work? import javax.validation.constraints.NotBlank;


    //private String name;

    private int unitSize;

    private boolean waitListOpen;

    private String occupantType;

    private String notes;

    @OneToOne
    private Location location;

    public HousingCommunity(){

    }

    public HousingCommunity(int unitSize, boolean waitListOpen, String occupantType, String notes, Location location) {
        this.unitSize = unitSize;
        this.waitListOpen = waitListOpen;
        this.occupantType = occupantType;
        this.notes = notes;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public int getUnitSize() {
        return unitSize;
    }

    public void setUnitSize(int unitSize) {
        this.unitSize = unitSize;
    }

    public boolean isWaitListOpen() {
        return waitListOpen;
    }

    public void setWaitListOpen(boolean waitListOpen) {
        this.waitListOpen = waitListOpen;
    }

    public String getOccupantType() {
        return occupantType;
    }

    public void setOccupantType(String occupantType) {
        this.occupantType = occupantType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "HousingCommunity{" +
                "location=" + location.getAddress() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HousingCommunity that = (HousingCommunity) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
