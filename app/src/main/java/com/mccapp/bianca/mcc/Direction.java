package com.mccapp.bianca.mcc;

import java.io.IOException;

/**
 * @author Group Ella
 */

/**
 * This class represents the implementation of the Directions used in ButtonView.
 *
 * */
public class Direction {


    // Implement the Controls for the Direction
    static void Forward() {
        try {
            BluetoothConnection.mmOutputStream.write("f".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void Backward() {
        try {
            BluetoothConnection.mmOutputStream.write("b".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void Right() {
        try {
            BluetoothConnection.mmOutputStream.write("r".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void Left() {
        try {
            BluetoothConnection.mmOutputStream.write("l".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void Stop() {
        try {
            BluetoothConnection.mmOutputStream.write("s".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void backRight() {
        try {
            BluetoothConnection.mmOutputStream.write("t".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void backLeft() {
        try {
            BluetoothConnection.mmOutputStream.write("w".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
