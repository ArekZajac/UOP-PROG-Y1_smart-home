package com.company;

public class SmartLamp extends SmartDevice {

    private LightModes.LightMode lightmode;

    public SmartLamp(String name, double location, boolean switchedOn, LightModes.LightMode mode) {
        super(name, location, switchedOn);
        this.lightmode = mode;
    }

    void setLightmode(LightModes.LightMode mode) {
        this.lightmode = mode;
    }

    LightModes.LightMode getLightmode() {
        return lightmode;
    }

    @Override
    public String toString() {
        String rtrn = "";
        rtrn += super.toString();
        rtrn += "Current Temp:  " + lightmode + "\n";
        return rtrn;
    }
}
