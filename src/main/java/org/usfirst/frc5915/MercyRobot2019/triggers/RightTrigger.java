/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5915.MercyRobot2019.triggers;

import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

/**
 * Add your docs here.
 */
public class RightTrigger extends Trigger {

  private XboxController joy;
  public RightTrigger(XboxController joy) {
  }

  @Override
  public boolean get() {
    double left_val = joy.getTriggerAxis(Hand.kLeft);
    double right_val = joy.getTriggerAxis(Hand.kRight);
    return (left_val==0) && (right_val>0);
  }
}
