/**
 * Marcus Moreira
 * 11/07/2021
 * Main.java
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Velocity vel = new Velocity(100,3.6);
        System.out.println(vel.timeAtIntercept());
        System.out.println(vel.distanceAtIntercept());
        System.out.println(vel.speedAtIntercept());
    }
}
