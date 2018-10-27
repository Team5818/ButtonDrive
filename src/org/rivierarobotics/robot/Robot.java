package org.rivierarobotics.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot {

    private DriveTrain driveTrain;
    private Joystick joystick;

    @Override
    public void robotInit() {
        driveTrain = new DriveTrain();
        joystick = new Joystick(0);
    }

    @Override
    public void teleopPeriodic() {
        // Check if Button 1 is pressed:
        if (joystick.getRawButton(1)) {
            // Set power to the drive train:
            // `0.2` means 20% power.
            // `0.0` would mean `0%`, and `1.0` means `100%`.
            driveTrain.setPower(0.2, 0.2);
        } else {
            driveTrain.setPower(0.0, 0.0);
        }
    }

}
