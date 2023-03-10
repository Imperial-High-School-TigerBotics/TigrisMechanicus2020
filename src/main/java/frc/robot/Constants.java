// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;

    public static final int YAxis = 0;
    public static final int XAxis = 1;
    public static final int SliderAxis = 3;
  }

  public static class SparkID {
    public static final int motorleft1 = 3;
    public static final int motorleft2 = 0;
    
    public static final int motorright1 = 5;
    public static final int motorright2 = 2;

    public static final int shooter = 1;
    public static final int intake = 4;
    public static final int conveyorBelt = 6;
  }

  public static class speedFactors{
    public static final double shooterSpeed = 0.85;
    public static final double sliderMax = 0.90;
    public static final double intakeSpeed = 0.65;
  }
}
