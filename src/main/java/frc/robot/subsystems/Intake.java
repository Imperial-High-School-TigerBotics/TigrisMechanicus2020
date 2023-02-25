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

public class Intake extends SubsystemBase {
  /** Creates a new Shooter. */
  private Spark intake;

  public Intake() {
    intake = new Spark(SparkID.intake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void intake( JoystickButton joy2, JoystickButton joy3)
  {
    if( joy2.getAsBoolean()){
      in();
    }else{
      stop();
    }
    if(joy3.getAsBoolean()){
      out();
    }else{
      stop();
    }
  }

  public Command in(){
    intake.set(speedFactors.intakeSpeed);
    return null;
  }
  
  public Command out(){
    intake.set(-speedFactors.intakeSpeed);
    return null;
  }

  public void stop()
  {
    intake.set(0);
  }
}