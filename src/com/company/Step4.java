package com.company;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        /* Using console input, allow the user to specify the number of smart devices (size) to be held in a SmartHome
        object. */
        System.out.println("|| Enter the number of smart devices:");
        int deviceCount = new Scanner(System.in).nextInt();

        //Create a SmartHome object using the size value given by the user.
        SmartHome home = new SmartHome(deviceCount);

        /* Using insertDevice(), populate the SmartHome object using a loop and user input for each value with a mixture
        of SmartDevice and SmartFridge objects. */
        for (int i = 0; i < deviceCount; i++) {
            System.out.println("|| Enter name of device " + (i + 1) + ":");
            String currentName = new Scanner(System.in).nextLine();
            System.out.println("|| Enter location of device " + (i + 1) + " (room.socket):");
            double currentLocation = new Scanner(System.in).nextDouble();
            System.out.println("|| Is device " + (i + 1) + " On (true/false)?");
            boolean currentIsOn = new Scanner(System.in).nextBoolean();
            // The first device will be a fridge.
            if (i == 0) {
                System.out.println("|| Temperature of fridge: ");
                double currentTemp = new Scanner(System.in).nextDouble();
                SmartFridge fridge = new SmartFridge(currentName, currentLocation, currentIsOn, currentTemp);
                home.insertDevice(fridge);
            } else {
                SmartDevice dev = new SmartDevice(currentName, currentLocation, currentIsOn);
                home.insertDevice(dev);
            }
            System.out.println();
        }

        // Verify that the SmartHome is correctly populated using the SmartHome object  toString() method.
        System.out.println(home.toString());

        /* Using console input, ask the user to specify the number of items to be held in an array of SmartDevices.
        Create the array in main(). Populate each item in the array using a loop and user input for each value with a
        mixture of SmartDevice and SmartFridge objects. */
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
            // The first device will be a fridge.
            if (i == 0) {
                System.out.println("|| Temperature of fridge: ");
                double currentTemp = new Scanner(System.in).nextDouble();
                devices[i] = new SmartFridge(currentName, currentLocation, currentIsOn, currentTemp);
            } else {
                devices[i] = new SmartDevice(currentName, currentLocation, currentIsOn);
            }
            System.out.println();
        }

        // Create a SmartHome object using the populated array.
        SmartHome home2 = new SmartHome(devices);

        // Verify that the SmartHome object is correctly populated using the SmartHome object toString() method.
        System.out.println(home2.toString());

        // Using the SmartHome shutdown() method, attempt to shut all devices down.
        home.shutdown();

        // Verify that the SmartFridge(s) remain(s) switched on using the SmartHome object’s toString() method.
        System.out.println(home.toString());

        /* For a selected fridge (use an appropriate index and the getDevice() method), increment the temperature.
        Verify that the current temperature has been updated using the SmartHome object’s toString() method. */
        SmartFridge fridge = (SmartFridge) home.getDevice(0);
        fridge.increment();
        System.out.println(home.toString());

        /* For the selected fridge decrement the temperature. Verify that the current temperature has been  updated
        using the SmartHome object toString() method. */
        fridge.decrement();
        System.out.println(home.toString());

    }
}
