package com.company;

import java.util.Scanner;

public class Step1 {

    private static void printAllDevices(SmartDevice[] devices){
        for (int i = 0; i < devices.length; i++) {
            System.out.println("----------");
            System.out.println("-DEVICE " + (i + 1) + "-");
            System.out.println("----------");
            System.out.println(devices[i].toString());
            System.out.println("----------");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("||| TEST 01");
        // Create a SmartDevice object with suitable parameter values.
        SmartDevice device = new SmartDevice("Lamp", 6.3, false);

        // Use the toString() method to display the object’s.
        System.out.println(device.toString());

        System.out.println("||| TEST 02");
        /* Using console input, allow the user to specify the number of Smart Devices to store in an array. Create an
        array with the given size in main(). Populate each element of the array using a loop and user input for each
        value. Test that the array is populated correctly by using a loop combined with the toString() method to display
        the details of all the SmartDevices. */
        System.out.println("|| Enter number of smart devices:");
        int deviceCount = new Scanner(System.in).nextInt();
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

        printAllDevices(devices);

        System.out.println("||| TEST 03");
        // Allow the user to select an item (SmartDevice) from the array by entering an index value.
        System.out.println("|| Enter the number of the device you want to toggle (1-" + devices.length + ")");
        int selectIndex = new Scanner(System.in).nextInt();

        /* Execute a switchOn()() or switchOff() operation on the selected SmartDevice to change the switchedOn value
        (from true to false, or from false to true). */
        System.out.print("|| Successfully turned device " + (selectIndex + 1) + " ");
        if (devices[selectIndex].isSwitchedOn()){
            devices[selectIndex].switchOff();
            System.out.println("off");
        } else {
            devices[selectIndex].switchOn();
            System.out.println("on");
        }
        System.out.println();

        /* Verify that the update procedure worked correctly by using a loop combined with the SmartDevice toString()
        method to display details of all the SmartDevices. */
        printAllDevices(devices);
    }
}
