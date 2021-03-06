/**
 * Marcus Moreira
 * 11/10/2021
 * Velocity.java
 */

public class Velocity {
    // The Velocity Class calculates the time, speed and distance 
    // of to objects that intercept when given the acceleration in meters/second of the first object
    // and the constant speed of the second object in Km/h.
    
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

    private double halfOfAcceleration() {
        // Get half of the acceleration

        return this.accelerationInSeconds/2;
    }
    
    private double divideConstantSpeedByAcceleration() {
        // Get the quotient of the constant speed and the acceleration

        return this.constantSpeed/this.accelerationInSeconds;
    }

    public double timeAtIntercept() {
        // Time in seconds it takes the first object to intercept the second object

        double time = divideConstantSpeedByAcceleration()/halfOfAcceleration();

        return time;
    }

    public double distanceAtIntercept() {
        // Distance in meters it takes for the first object to intercept the seconf object

        return divideConstantSpeedByAcceleration() * timeAtIntercept();
    }

    public double speedAtIntercept() {
        // Speed in Km/h for the first to the second object

        double conversionFor_ms_To_Kmh = 3.6;
        double speedMS = this.accelerationInSeconds * timeAtIntercept();
        double speedKH = speedMS * conversionFor_ms_To_Kmh;

        return speedKH;
    }

    public String toString() { 
        // This method will be used in createFile()
        // This method organizes the information provided by the user and calculated by the privious methods   
        
        String output = new String();

        output = Double.toString(this.constantSpeed) + ", "; 
        output += Double.toString(this.accelerationInSeconds) + ", ";
        output += Double.toString(timeAtIntercept()) + ", ";
        output += Double.toString(distanceAtIntercept()) + ", ";
        output += Double.toString(speedAtIntercept()) + "\r\n";

        return output;
    }
}
