/**
 * Marcus Moreira
 * 11/11/2021
 * Main.java
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Velocity vel = new Velocity(100,3.6);
        System.out.println(vel.timeAtIntercept());
        System.out.println(vel.distanceAtIntercept());
        System.out.println(vel.speedAtIntercept());
    }
}
