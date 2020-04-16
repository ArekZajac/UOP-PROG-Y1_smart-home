package com.company;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args){

        // Create a SmartHome object and fully populate it.
        System.out.println("|| Enter the number of smart devices:");
        int deviceCount = new Scanner(System.in).nextInt();
        SmartHome home = new SmartHome(deviceCount);
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

        /* Given the array is now fully populated, create a new SmartDevice and attempt to add it to the SmartHome. This
        should invoke the addDevice() method and the SmartDevice object should be added, resulting in an increase in
        the size of the array in the SmartHome object. */

    }
}
