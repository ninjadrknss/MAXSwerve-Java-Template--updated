package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

public class CoralIntakeSubsystem extends SubsystemBase {
    private final SparkMax intakeMotor;

    public CoralIntakeSubsystem() {
        intakeMotor = new SparkMax(15, MotorType.kBrushless); // CAN ID 15
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    public void intake(double speed) {
        intakeMotor.set(speed); // Set motor to intake
    }

    public void eject() {
        intakeMotor.set(-1.0); // Set motor to eject
    }

    public void stop() {
        intakeMotor.set(0); // Stop the motor
    }
}