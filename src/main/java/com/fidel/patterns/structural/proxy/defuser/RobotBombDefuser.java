package com.fidel.patterns.structural.proxy.defuser;

import java.util.Random;

public class RobotBombDefuser {
    private Random random = new Random();
    private int robotConfiguredWavelength = 41;
    private boolean isConnected = false;

    public void connectWireless(int communicationWaveLength) {
        if (communicationWaveLength == robotConfiguredWavelength) {
            isConnected = isConnectedImitatingConnectivityIssues();
        }
    }

    public boolean isConnected() {
        isConnected = isConnectedImitatingConnectivityIssues();
        return isConnected;
    }

    private boolean isConnectedImitatingConnectivityIssues() {
        // bad connection imitation (works in 9 from 10 attempts)
        return random.nextInt(10) < 9;
    }

    public void walkStraightForward(int steps) {
        System.out.println("Did " + steps + " steps forward...");
    }

    public void turnRight() {
        System.out.println("Turned right...");
    }

    public void turnLeft() {
        System.out.println("Turned left...");
    }

    public void defuseBomb() {
        System.out.println("Cut red or green or blue wire...");
    }
}
