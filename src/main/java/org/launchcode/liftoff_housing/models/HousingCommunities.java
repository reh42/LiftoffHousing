package org.launchcode.liftoff_housing.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;


public class HousingCommunities {

    @Id
    @GeneratedValue
    private int id;

    // @NotBlank how to get validation package to work? import javax.validation.constraints.NotBlank;

    private String name;

    private int unitSize;

    private boolean waitListOpen;

    private String occupantType;

    private String notes;

    private Location location;

    @Override
    public String toString() {
        return "HousingCommunities{" +
                "location=" + location +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HousingCommunities that = (HousingCommunities) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


}
