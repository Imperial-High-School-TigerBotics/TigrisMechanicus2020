// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.DriveTrainCmd;
import frc.robot.commands.IntakeCmd;
import frc.robot.commands.ShooterCmd;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj.Joystick;
//import frc.robot.commands.Autos;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {
  public static Joystick controller;

  public static JoystickButton joy1;
  public static JoystickButton joy2;
  public static JoystickButton joy3;

  private final DriveTrain driveTrain;
  private final DriveTrainCmd driveTrainCmd;
  
  private final Shooter shooter;
  private final ShooterCmd shooterCmd;

  private final Intake intake;
  private final IntakeCmd intakeCmd;

  public RobotContainer(){
    controller = new Joystick(OperatorConstants.kDriverControllerPort);

    joy1 = new JoystickButton(controller, 1);
    joy2 = new JoystickButton(controller, 2);
    joy3 = new JoystickButton(controller, 3);

    driveTrain = new DriveTrain();
    driveTrainCmd = new DriveTrainCmd(driveTrain);
    driveTrain.setDefaultCommand(driveTrainCmd);

    shooter = new Shooter();
    shooterCmd = new ShooterCmd(shooter);
    shooter.setDefaultCommand(shooterCmd);

    intake = new Intake();
    intakeCmd = new IntakeCmd(intake);
    intake.setDefaultCommand(intakeCmd);

    configureButtonBindings();
  }

  private void configureButtonBindings(){
    
  }

  //public Command getAutonomousCommand(){}
}