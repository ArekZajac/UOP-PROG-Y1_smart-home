package com.company;

public class SmartDevice {

    private String name;
    private double location;
    private boolean switchedOn;

    SmartDevice(String name, double location, boolean switchedOn) {
        this.name = name;
        this.location = location;
        this.switchedOn = switchedOn;
    }

    void setName(String deviceName) {
        this.name = deviceName;
    }

    String getName() {
        return name;
    }

    void setLocation(double devieLocation) {
        this.location = devieLocation;
    }

    double getLocation() {
        return location;
    }

    void switchOn() {
        switchedOn = true;
    }

    void switchOff() {
        switchedOn = false;
    }

    boolean isSwitchedOn() {
        return switchedOn;
    }

    public String toString() {
        String returnValue = "";
        returnValue += "Name:          " + name + "\n";
        returnValue += "Location:      " + location + "\n";
        returnValue += "Switched On:   " + switchedOn + "\n";
        return returnValue;
    }
}
