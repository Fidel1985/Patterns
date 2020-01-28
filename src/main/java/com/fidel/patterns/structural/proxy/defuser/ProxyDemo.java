package com.fidel.patterns.structural.proxy.defuser;

public class ProxyDemo {

    public static void main (String[] args) {
        RobotBombDefuserProxy kinect = new RobotBombDefuserProxy(41);
        kinect.turnLeft();
        kinect.walkStraightForward(10);
        kinect.turnRight();
        kinect.walkStraightForward(3);
        kinect.defuseBomb();
    }
}
