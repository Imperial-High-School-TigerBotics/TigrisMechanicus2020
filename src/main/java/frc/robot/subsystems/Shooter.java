// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants;
import frc.robot.Constants.SparkID;
import frc.robot.Constants.speedFactors;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */
  private Spark shooter;

  public Shooter() {
    shooter = new Spark(SparkID.shooter);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shootBall( JoystickButton joy1, JoystickButton joy3 )
  {
    if( joy1.getAsBoolean()){
      start();
    }else{
      stop();
    }
  
    if( joy3.getAsBoolean()){
      outtake();
    }else{
      stop();
    }
   // joy3.onFalse(outtake());
  }

  public Command start(){
    shooter.set(speedFactors.shooterSpeed);
    return null;
  }

  public Command outtake(){
    shooter.set(speedFactors.shooterSpeed);
    return null;
  }

  public void stop()
  {
    shooter.set(0);
  }
}