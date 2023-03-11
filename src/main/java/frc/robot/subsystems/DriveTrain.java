package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import frc.robot.Constants.OperatorConstants;
import frc.robot.Constants.SparkID;

public class DriveTrain extends SubsystemBase {
    private Spark left1;
    private Spark left2;
    private Spark right1;
    private Spark right2;

    private MotorControllerGroup leftMotors;
    private MotorControllerGroup rightMotors;

    public DriveTrain(){
        left1 = new Spark(SparkID.motorleft1);
        left2 = new Spark(SparkID.motorleft2);

        right1 = new Spark(SparkID.motorright1);
        right2 = new Spark(SparkID.motorright2);

        leftMotors = new MotorControllerGroup(left1, left2);
        rightMotors = new MotorControllerGroup(right1, right2);
    }

    @Override
    public void periodic(){}

    public void driveWithJoysticks(Joystick controller){

        double speedChanger = -controller.getRawAxis(3);

        double Yspeed = controller.getRawAxis(OperatorConstants.YAxis) * speedChanger;
        double Xspeed = -controller.getRawAxis(OperatorConstants.XAxis) * speedChanger;

        double left = Yspeed + Xspeed;
        double right = Yspeed - Xspeed;

        leftMotors.set(left);
        rightMotors.set(right);
    }
}
