package com.example.proxypattern;

/**
 * @author Yoko Ahadazaro (yoko.ahadazaro@dana.id)
 * @version Robot, v 0.1 2019-11-12 14:20 by Yoko Ahadazaro
 */
public class Robot implements ControlPanel {

    private boolean robotStatus;

    @Override
    public void getRobotStatus() {
        System.out.println("Already On");
    }

    @Override
    public void transformRobot() {
        System.out.println("Transforming");
    }
}