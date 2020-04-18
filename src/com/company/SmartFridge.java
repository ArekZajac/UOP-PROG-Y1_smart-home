package com.company;

public class SmartFridge extends SmartDevice {

    private double currentTemperature;

    SmartFridge(String name, double location, boolean switchedOn, double currentTemperature) {
        super(name, location, switchedOn);
        this.currentTemperature = currentTemperature;
    }

    double getCurrentTemperature() {
        return currentTemperature;
    }

    void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    void increment() {
        currentTemperature = currentTemperature + 1;
    }

    void decrement() {
        currentTemperature = currentTemperature - 1;
    }

    @Override
    public void switchOff() {
    }

    @Override
    public String toString() {
        String rtrn = "";
        rtrn += super.toString();
        rtrn += "Current Temp:  " + currentTemperature + "\n";
        return rtrn;
    }

}
