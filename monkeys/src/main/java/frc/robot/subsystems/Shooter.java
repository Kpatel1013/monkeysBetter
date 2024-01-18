package frc.robot.subsystems;

public class Shooter {
    private boolean isShooting;
    private double Velocity;

    public boolean isShooting() {
        return isShooting;
      }

      public void isShooting(boolean isShooting) {
        this.isShooting = isShooting;
      }

    public double Velocity() {
        return Velocity;
      }
    
    public void Velocity(double Velocity) {
        this.Velocity = Velocity;
      }
     
    
     

}
