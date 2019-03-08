// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5915.MercyRobot2019;

import org.usfirst.frc5915.MercyRobot2019.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc5915.MercyRobot2019.subsystems.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton startButton;
    public JoystickButton backButton;
    public JoystickButton xButton;
    public JoystickButton aButton;
    public JoystickButton bButton;
    public JoystickButton yButton;
    public JoystickButton rightTriggerButton;
    public JoystickButton leftTriggerButton;
    public XboxController joy;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joy = new XboxController(0);
        
        aButton = new JoystickButton(joy, 1);
        aButton.whileHeld(new BallOut());
        xButton = new JoystickButton(joy, 3);
        xButton.whileHeld(new BallIn());
        bButton = new JoystickButton(joy, 2);
        bButton.whileHeld(new HatchUp());
        yButton = new JoystickButton(joy, 4);
        yButton.whileHeld(new HatchDown());
        startButton = new JoystickButton(joy, 8);
        backButton = new JoystickButton(joy, 7);
        startButton.whileHeld(new ReleaseRamp());
        rightTriggerButton = new JoystickButton(joy, 6);
        rightTriggerButton.whileHeld(new LowerArm());
        leftTriggerButton = new JoystickButton(joy, 5);
        leftTriggerButton.whileHeld(new RaiseArm());



        

        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Release Ramp", new ReleaseRamp());
        SmartDashboard.putData("BallIn", new BallIn());
        SmartDashboard.putData("BallOut", new BallOut());
        SmartDashboard.putData("HatchUp", new HatchUp());
        SmartDashboard.putData("HatchDown", new HatchDown());
        SmartDashboard.putData("RaiseArm", new RaiseArm());
        SmartDashboard.putData("LowerArm", new LowerArm());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    public boolean shouldReleaseRamp() {
        return startButton.get() && backButton.get();
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

