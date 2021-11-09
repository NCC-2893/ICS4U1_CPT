/**
 * Marcus Moreira
 * 11/11/2021
 * Main.java
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Velocity[] vel = new Velocity[5];
        
        vel[0] = new Velocity(80,3.6);
        vel[1] = new Velocity(100,3.6);
        vel[2] = new Velocity(90,3.6);
        vel[3] = new Velocity(130,3.6);
        vel[4] = new Velocity(50,3.6);

        System.out.println();
        SortArray sort = new SortArray();
        sort.bubbleSort(vel);
        
        for (Velocity v: vel){
            System.out.println(v.getConstantSpeed());
            System.out.println(v.timeAtIntercept());
            System.out.println(v.distanceAtIntercept());
            System.out.println(v.speedAtIntercept());
            System.out.println();
        }
    }
}
