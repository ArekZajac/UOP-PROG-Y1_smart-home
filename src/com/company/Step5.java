package com.company;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args){

        System.out.println("||| TEST 01");
        /* Create SmartHome object and fully populate it with a mixture of SmartDevices, a SmartFridge and two Smart
        Lamps in different rooms. */
        SmartDevice[] devices = new SmartDevice[5];
        devices[0] = new SmartDevice("TV", 2.3, false);
        devices[1] = new SmartDevice("Desktop", 5.1, true);
        devices[2] = new SmartFridge("Fridge", 3.4, true, 3);
        devices[3] = new SmartLamp("Desk Lamp", 5.3, true, LightModes.LightMode.SOFT_MODE);
        devices[4] = new SmartLamp("Wall Lamp", 1.2, true, LightModes.LightMode.STANDARD_MODE);
        SmartHome home = new SmartHome(devices);

        /* Using console input to obtain a valid index for the SmartHome object from the user,  use getDevice() to
        select a smart lamp and with the returned object change the lighting mode. */
        System.out.println("Select either lamp 1 or 2 to change the lighting mode to night mode (1/2):");
        if (new Scanner(System.in).nextInt() == 1){
            SmartLamp lamp = (SmartLamp) home.getDevice(3);
            lamp.setLightmode(LightModes.LightMode.NIGHT_MODE);
        } else {
            SmartLamp lamp = (SmartLamp) home.getDevice(4);
            lamp.setLightmode(LightModes.LightMode.NIGHT_MODE);
        }

        // Verify these changes using the SmartHome object toString() method.
        System.out.println(home.toString());

        System.out.println("||| TEST 02");
        /* Using console input to obtain a valid location for  the SmartHome object from the user, use getDevice()  to
        select a smart lamp and with the returned object change the lighting mode. */
        System.out.println("Select either lamp 1 or 2 to change the lighting mode to soft mode (1/2):");
        if (new Scanner(System.in).nextInt() == 1){
            SmartLamp lamp = (SmartLamp) home.getDevice(3);
            lamp.setLightmode(LightModes.LightMode.SOFT_MODE);
        } else {
            SmartLamp lamp = (SmartLamp) home.getDevice(4);
            lamp.setLightmode(LightModes.LightMode.SOFT_MODE);
        }

        // Verify these changes using the SmartHome object toString() method.
        System.out.println(home.toString());

        System.out.println("||| TEST 03");
        /* Using console input, obtain a valid location in the SmartHome object from the user. Use getDevice()  to
        select a smart lamp and with the returned object change the lighting mode to a different lighting mode:
        BRIGHT_MODE. */
//        System.out.println("Select either lamp 1 or 2 to change the lighting mode to bright mode (1/2):");
//        if (new Scanner(System.in).nextInt() == 1){
//            SmartLamp lamp = (SmartLamp) home.getDevice(3);
//            lamp.setLightmode(LightModes.LightMode.BRIGHT_MODE);
//        } else {
//            SmartLamp lamp = (SmartLamp) home.getDevice(4);
//            lamp.setLightmode(LightModes.LightMode.BRIGHT_MODE);
//        }

        // Verify these changes to the lighting mode cannot be done using the SmartHome object toString() method.
        System.out.println(home.toString());
    }
}
