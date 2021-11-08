public class Velocity {
    private double constantSpeed;
    private double accelerationInSeconds;

    public Velocity(double constantSpeed, double acceleration){
        this.constantSpeed = constantSpeed;
        this.accelerationInSeconds = acceleration;
    }

    public double getConstantSpeed() {
        return constantSpeed;
    }

    public void setConstantSpeed(double constantSpeed) {
        this.constantSpeed = constantSpeed;
    }

    public double getAcceleration() {
        return accelerationInSeconds;
    }

    public void setAcceleration(double accelerationInSeconds) {
        this.accelerationInSeconds = accelerationInSeconds;
    }

    private double halfOfAcceleration(){
        return 0.5 * this.accelerationInSeconds;
    }
    
    private double divideConstantSpeedByAcceleration(){
        return this.constantSpeed/this.accelerationInSeconds;
    }

    public double timeAtIntercept(){
        double time = divideConstantSpeedByAcceleration()/halfOfAcceleration();
        return time;
    }

    public double distanceAtIntercept(){
        return divideConstantSpeedByAcceleration() * timeAtIntercept();
    }

    public double speedAtIntercept(){
        double speedMS = this.accelerationInSeconds * timeAtIntercept();
        double speedKH = speedMS * 3.6;
        return speedKH;
    }
}
