package com.fidel.patterns.structural.proxy.defuser;

public class RobotBombDefuserProxy {
    private RobotBombDefuser robotBombDefuser;
    private int communicationWaveLength;
    private int connectionAttempts = 3;

    public RobotBombDefuserProxy(int communicationWaveLength) {
        this.robotBombDefuser = new RobotBombDefuser();
        this.communicationWaveLength = communicationWaveLength;
    }

    public void walkStraightForward(int steps) {
        EnsureConnectedWithRobot();
        robotBombDefuser.walkStraightForward(steps);
    }

    public void turnRight() {
        EnsureConnectedWithRobot();
        robotBombDefuser.turnRight();
    }

    public void turnLeft() {
        EnsureConnectedWithRobot();
        robotBombDefuser.turnLeft();
    }

    public void defuseBomb() {
        EnsureConnectedWithRobot();
        robotBombDefuser.defuseBomb();
    }

    private void EnsureConnectedWithRobot() {
        if (robotBombDefuser == null) {
            robotBombDefuser = new RobotBombDefuser();
            robotBombDefuser.connectWireless(communicationWaveLength);
        }
        for (int i = 0; i < connectionAttempts; i++) {
            if (!robotBombDefuser.isConnected()) {
                robotBombDefuser.connectWireless(communicationWaveLength);
            } else {
                break;
            }
        }
        if (!robotBombDefuser.isConnected()) {
            throw new BadConnectionException("No connection with remote bomb diffuser robot could be made after few attempts.");
        }
    }
}
