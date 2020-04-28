package com.company;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {

        System.out.println("||| TEST 01");
        /* Using console input, ask the user to specify the number of smart devices (size) to be held in the SmartHome
        object. */
        System.out.println("|| Enter the number of smart devices:");
        int deviceCount = new Scanner(System.in).nextInt();

        //Create a SmartHome object using the size value given by the user.
        SmartHome home = new SmartHome(deviceCount);

        /* Populate the SmartHome object with Smart devices using a loop, user inputs for each new SmartDevice, and the
        insertDevice() method. */
        for (int i = 0; i < deviceCount; i++) {
            System.out.println("|| Enter name of device " + (i + 1) + ":");
            String currentName = new Scanner(System.in).nextLine();
            System.out.println("|| Enter location of device " + (i + 1) + " (room.socket):");
            double currentLocation = new Scanner(System.in).nextDouble();
            System.out.println("|| Is device " + (i + 1) + " On (true/false)?");
            boolean currentIsOn = new Scanner(System.in).nextBoolean();
            SmartDevice dev = new SmartDevice(currentName, currentLocation, currentIsOn);
            home.insertDevice(dev);
            System.out.println();
        }

        // Verify that the SmartHome is correctly populated using the SmartHome object  toString() method.
        System.out.println(home.toString());

        System.out.println("||| TEST 02");
        /* Using console input, ask the user to specify the number of items to be held in an array of SmartDevices.
        Create the array in main(). Populate each item in the array using a loop and user input for each new SmartDevice
        object. */
        System.out.println("|| Enter the number of smart devices:");
        deviceCount = new Scanner(System.in).nextInt();
        SmartDevice[] devices = new SmartDevice[deviceCount];
        for (int i = 0; i < devices.length; i++) {
            System.out.println("|| Enter name of device " + (i + 1) + ":");
            String currentName = new Scanner(System.in).nextLine();
            System.out.println("|| Enter location of device " + (i + 1) + " (room.socket):");
            double currentLocation = new Scanner(System.in).nextDouble();
            System.out.println("|| Is device " + (i + 1) + " On (true/false)?");
            boolean currentIsOn = new Scanner(System.in).nextBoolean();
            devices[i] = new SmartDevice(currentName, currentLocation, currentIsOn);
            System.out.println();
        }

        // Create a SmartHome object using the populated array.
        SmartHome home2 = new SmartHome(devices);

        // Verify that the SmartHome object is correctly populated using the SmartHome object toString() method.
        System.out.println(home2.toString());

        System.out.println("||| TEST 03");
        /* Ask the user for an index, and using the getDevice() method, return the specific SmartDevice at that index to
        the main(). */
        System.out.println("|| Enter the number of the device you want to toggle (1-" + home.devices.length + "):");
        int selectIndex = new Scanner(System.in).nextInt();
        System.out.println("Chosen device " + selectIndex);

        /* Execute a switchOn()() or switchOff() operation on this SmartDevice to change the switchedOn value (from true
        to false, or from false to true). */
        home.toggle(home.getDevice(selectIndex - 1).getLocation());

        // Verify the values are updated using the SmartHome object’s toString() method.
        System.out.println(home.toString());

        System.out.println("||| TEST 04");
        /* Ask the user for a location and using the getDevice() method, return the specific SmartDevice at that
        location to the main(). */
        System.out.println("|| Enter the location of the device you want to toggle:");
        double selectLocation = new Scanner(System.in).nextDouble();

        // Execute a switchOn() or switchOff() operation on this SmartDevice to change the switchedOn value.
        home.toggle(selectLocation);

        // Verify this using the SmartHome object’s toString() method.
        System.out.println(home.toString());
    }
}
