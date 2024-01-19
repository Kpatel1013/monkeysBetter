package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants;

public class Shooter {
    private boolean isShooting;
    private double Velocity;

    WPI_TalonFX bottomMotorForShooter = new WPI_TalonFX(Constants.bottomMotorForShooter);
    WPI_TalonFX topMotorForShooter = new WPI_TalonFX(Constants.topMotorForShooter);

    topMotorForShooter.follow(bottomMotorForShooter);

  

    public double getVelocity() {
        return this.bottomMotorForShooter.getSelectedSensorVelocity() 
      }
    
    public double getVoltageOutput() {
        return this.bttomMotorForShooter.getMotorOutputVoltage();
      }
    
    public void setVelocity(double Velocity) {
        this.Velocity = Velocity;
      }
     
    public boolean isShooting() {
        return isShooting;
      }

    public void isShooting(boolean isShooting) {
        this.isShooting = isShooting;
      }
    
     

}
