package com.company;

public class SmartHome {

    public SmartDevice[] devices;

    private int index;

    SmartHome(int size) {
        devices = new SmartDevice[size];
        index = 0;
    }

    SmartHome(SmartDevice[] devices) {
        this.devices = devices;
    }

    public void insertDevice(SmartDevice device) {
        if(index >= devices.length) {return;}
        devices[index] = device;
        index++;
    }

    public void insertDevice(String name, double location, boolean switchedOn) {
        if(index >= devices.length) {return;}
        SmartDevice obj = new SmartDevice(name, location, switchedOn);
        devices[index] = obj;
        index++;
    }

    public SmartDevice getDevice(int index) {
        return devices[index];
    }

    public SmartDevice getDevice(double location) {
        for (SmartDevice device : devices) {
            if (device.getLocation() == location) {
                return device;
            }
        }
        return null;
    }

    void toggle(double location) {
        if (getDevice(location).isSwitchedOn()){
            getDevice(location).switchOff();
        } else {
            getDevice(location).switchOn();
        }
    }

    @Override
    public String toString() {
        String values = "";
        for (int i = 0; i < devices.length; i++) {
            values += "----------\n";
            values += "-DEVICE " + (i + 1) + "-" +"\n";
            values += "----------\n";
            values += devices[i].toString();
        }
        values += "----------\n";
        return values;
    }

    void addDevice(SmartDevice device) {

    }

    void setAllInRoom(int room, boolean switchedOn) {
        for (SmartDevice device : devices) {
            if (String.valueOf(device.getLocation()).matches(room + ".(.*)")) {
                if (switchedOn) {
                    device.switchOn();
                } else {
                    device.switchOff();
                }
            }
        }
    }

    void shutdown(){
        for (SmartDevice device : devices) {
            device.switchOff();
        }
    }

    void insertDevice(){

    }

}
