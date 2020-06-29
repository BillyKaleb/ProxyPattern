package com.example.proxypattern;

/**
 * @author Yoko Ahadazaro (yoko.ahadazaro@dana.id)
 * @version RobotControlPanel, v 0.1 2019-11-12 14:20 by Yoko Ahadazaro
 */
public class RobotControlPanel implements ControlPanel {

    private Robot robot;

    @Override
    public void getRobotStatus() {
        if (robot != null) {
            robot.getRobotStatus();
        } else {
            System.out.println("Still off");
        }
    }

    @Override
    public void transformRobot() {
        if (robot == null) {
            robot = new Robot();
            System.out.println("Turning on...");
        }
        robot.transformRobot();
    }
}
